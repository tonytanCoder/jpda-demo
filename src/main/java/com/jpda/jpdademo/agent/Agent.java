package com.jpda.jpdademo.agent;

import com.jpda.jpdademo.util.Utils;

import java.io.PrintStream;
import java.lang.instrument.Instrumentation;

public class Agent {

    /**
     * 类加载器
     */
    private static volatile ClassLoader cachedAgentClassLoadHolder = null;

    private static final PrintStream ps = System.err;


    public static ClassLoader getAgentClassLoader() {
        if (cachedAgentClassLoadHolder == null) {
            throw new RuntimeException("AgentClassloader暂时不可用");
        }
        return cachedAgentClassLoadHolder;
    }


    /// static attach
    public static void premain(String args, Instrumentation inst) throws Exception {
        doAttachJvm(args, inst);
    }

    /// dynamic attach by VirtualMachine.attach
    public static void agentmain(String args, Instrumentation inst) throws Exception {
        doAttachJvm(args, inst);
    }

    private static synchronized void doAttachJvm(String args, Instrumentation inst) {

        ps.println("I Am run in Thread:" + Thread.currentThread().getName());

        // 没有提供参数，只能就此结束
        if (Utils.isNullOrEmpty(args)) {
            ps.println("需要提供挂在JVM所需要的参数，[coreJar;configure]");
            return;
        }

        String[] argsArr = args.split(";");

        if (Utils.isNullOrEmptyArray(argsArr)) {
            ps.println("需要提供挂在JVM所需要的参数，[coreJar;configure]");
            return;
        }

        String coreJar = argsArr[0];
        String config = argsArr[1];

        if (coreJar.startsWith("//")) {
            coreJar = coreJar.substring(1);
        }

        try {

        } catch (Throwable e) {
            e.printStackTrace();
            ps.println(e);
        }

    }
}