package com.jpda.jpdademo.agent;

import java.lang.reflect.Method;

public class WeaveSpy {

    // 目标jvm通过获取到这个classLoader来寻找agent内部的类信息
    public static ClassLoader AGENT_CLASS_LOADER;



    public static Method ON_METHOD_ENTER_CALL;

    public static Method ON_METHOD_EXIT_CALL;


    /**
     *  初始化agent classLoader
     *
     * @param agentLoader
     */
    public static void initAgentClassLoader(ClassLoader agentLoader) {
        AGENT_CLASS_LOADER = agentLoader;
    }



    /**
     *  初始化Spy方法，应该将正确的目标Method安装起来
     *
     * @param ON_METHOD_ENTER 方法进入
     * @param ON_METHOD_EXIT 方法出口
     * @param ON_METHOD_THROW_EXCEPTION 抛出异常
     * @param ON_METHOD_INVOKE_LINE 访问某一行
     * @param ON_METHOD_INVOKE_VAR_INS 访问变量，主要关注存储、加载命令，这样可以获取到变量的最新值
     */
    public static void installAdviceMethod(Method ON_METHOD_ENTER,
                                           Method ON_METHOD_EXIT,
                                           Method ON_METHOD_THROW_EXCEPTION,
                                           Method ON_METHOD_INVOKE_LINE,
                                           Method ON_METHOD_INVOKE_VAR_INS,
                                           Method ON_METHOD_INVOKE_VAR_INS_V2,
                                           Method ON_METHOD_INVOKE_VAR_INS_I,
                                           Method ON_METHOD_INVOKE_VAR_INS_L,
                                           Method ON_METHOD_INVOKE_VAR_INS_F,
                                           Method ON_METHOD_INVOKE_VAR_INS_D,
                                           Method ON_METHOD_INVOKE_VAR_INS_A,
                                           Method ON_METHOD_IN_SPECIAL_DATA_TRANS,
                                           Method ON_METHOD_IN_SPECIAL_CONDITION_JUDGE,
                                           Method ON_METHOD_IN_SPECIAL_CONDITION_TRANS_DATA_GET,
                                           Method ON_METHOD_FIELD_INVOKE
    ) {

        ON_METHOD_ENTER_CALL = ON_METHOD_ENTER;
        ON_METHOD_EXIT_CALL = ON_METHOD_EXIT;
    }

}
