package com.jpda.jpdademo.transport;

import com.jpda.jpdademo.Constant;
import com.jpda.jpdademo.RemoteServer;
import com.jpda.jpdademo.config.Configure;
import com.jpda.jpdademo.exception.ConfigureErrorException;
import com.jpda.jpdademo.log.PSLogger;
import com.sun.corba.se.impl.activation.CommandHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.WriteBufferWaterMark;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

import java.lang.instrument.Instrumentation;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class NettyTransportServer  implements RemoteServer {


    private ChannelFuture channelFuture;

    static Instrumentation ins;

    private volatile boolean setup = false;

    //---------------------------------------------
    /// 是否允许控制探测器，如果安装了，那么当一个连接空闲时间
    /// 超过阈值之后，这个连接就会被关闭
    //---------------------------------------------
    private volatile boolean allowIdleHandler = true;

    private CommandHandler commandHandler;

    private static AtomicInteger threadNoCnt = new AtomicInteger(0);

    private static EventLoopGroup bossGroup = null;

    private static EventLoopGroup workGroup = null;



    public static void main(String[] args) {

        Configure configure = new Configure();

        configure.setTargetIp(Constant.DEFAULT_SERVER_IP);
        configure.setTargetPort(Constant.DEFAULT_SERVER_PORT);

    }

    @Override
    public boolean isBind() {
        return false;
    }

    @Override
    public void start(com.jpda.jpdademo.Configure configure) throws Exception {

        if (configure == null) {
            throw new ConfigureErrorException("配置信息不完整");
        }

        PSLogger.initServerLogger();

        bossGroup = new NioEventLoopGroup(1, new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setName("JavaDebug-NettyServer-Boss-Worker-" + threadNoCnt.incrementAndGet());
                return thread;
            }
        });

        workGroup = new NioEventLoopGroup(2, new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setName("JavaDebug-NettyServer-EventLoop-Worker-" + threadNoCnt.incrementAndGet());
                return thread;
            }
        });

        ((NioEventLoopGroup)workGroup).setIoRatio(70);


        ServerBootstrap serverBootstrap = new ServerBootstrap().group(bossGroup, workGroup)
                .channel(NioServerSocketChannel.class)
                .option(ChannelOption.SO_BACKLOG, 4)
                .option(ChannelOption.SO_REUSEADDR, true)
                .childOption(ChannelOption.TCP_NODELAY, true)
                .childOption(ChannelOption.SO_KEEPALIVE, true)
                /// 高低水位，用于保护客户端
                /// 当输出缓冲区中缓存数据大于高水位后，Channel变得不可写，当不可写之后，缓存区的数据大小
                /// 低于低水位之后，Channel再次变得可写,每次写的时候请判断Channel是否可以
                .childOption(ChannelOption.WRITE_BUFFER_WATER_MARK,
                        new WriteBufferWaterMark(4 * 1024, 8 * 1024))
                .option(ChannelOption.ALLOCATOR, PooledByteBufAllocator.DEFAULT)
                .childOption(ChannelOption.ALLOCATOR, PooledByteBufAllocator.DEFAULT);






    }

    @Override
    public void stop(com.jpda.jpdademo.Configure configure) throws Exception {

    }

    @Override
    public void stop() throws Exception {

    }
}
