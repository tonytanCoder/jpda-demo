package com.jpda.jpdademo;

public class Constant {

    //// java version

    static final int V1_1 = 3 << 16 | 45;
    static final int V1_2 = 0 << 16 | 46;
    static final int V1_3 = 0 << 16 | 47;
    static final int V1_4 = 0 << 16 | 48;
    static final int V1_5 = 0 << 16 | 49;
    static final int V1_6 = 0 << 16 | 50;
    static final int V1_7 = 0 << 16 | 51;
    static final int V1_8 = 0 << 16 | 52;
    static final int V9 = 0 << 16 | 53;

    /// print color control

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    //// server config

    public static final String DEFAULT_SERVER_IP = "127.0.0.1";

    public static final int DEFAULT_SERVER_PORT = 11234;

    public static final String JAVA_DEBUG_WORKER_NAME_PREFIX = "java-debug-business-execute-thread-";

    public static final String JAVA_DEBUG_JOB_EXECUTOR_PREFIX = "java-debug-tool-job-executor-thread";

    // whether dump object deeply, if the value equals false, just using toString of the origin object
    public static final boolean DUMP_OBJECT_OPTIONS = false;

}