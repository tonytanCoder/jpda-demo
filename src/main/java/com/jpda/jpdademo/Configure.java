package com.jpda.jpdademo;

import com.jpda.jpdademo.util.UTILS;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Configure {

    private String pid;
    private String targetIp;
    private int targetPort;
    private String agentJar;
    private String coreJar;

    private static final Configure EMPTY_CONFIG = new Configure();

    private static final Map<String, BiConsumer<Configure, String>> FIELD_APPLY_MAP = new HashMap<>();
    static {
        FIELD_APPLY_MAP.put("pid", new BiConsumer<Configure, String>() {
            @Override
            public void accept(Configure configure, String s) {
                configure.setPid(s);
            }
        });
        FIELD_APPLY_MAP.put("targetIp", new BiConsumer<Configure, String>() {
            @Override
            public void accept(Configure configure, String s) {
                configure.setTargetIp(s);
            }
        });
        FIELD_APPLY_MAP.put("targetPort", new BiConsumer<Configure, String>() {
            @Override
            public void accept(Configure configure, String s) {
                int port = UTILS.safeParseInt(s, -1);
                configure.setTargetPort(port);
            }
        });
        FIELD_APPLY_MAP.put("agentJar", new BiConsumer<Configure, String>() {
            @Override
            public void accept(Configure configure, String s) {
                configure.setAgentJar(s);
            }
        });
        FIELD_APPLY_MAP.put("coreJar", new BiConsumer<Configure, String>() {
            @Override
            public void accept(Configure configure, String s) {
                configure.setCoreJar(s);
            }
        });
    }

    @Override
    public String toString() {
        return String.format(
                "pid=%s,targetIp=%s,targetPort=%d,agentJar=%s,coreJar=%s",
                pid, targetIp, targetPort, agentJar, coreJar);
    }

    public static Configure toConfigure(String conf) {
        if (UTILS.isNullOrEmpty(conf)) {
            return EMPTY_CONFIG;
        }
        String[] kvs = conf.split(",");
        if (UTILS.isNullOrEmptyArray(kvs)) {
            return EMPTY_CONFIG;
        }
        Configure configure = new Configure();
        for (String kv : kvs) {
            String[] keyVal = kv.split("=");
            if (UTILS.isNullOrEmptyArray(keyVal) || keyVal.length != 2) {
                continue;
            }
            if (null == FIELD_APPLY_MAP.get(keyVal[0])) {
                continue;
            }
            FIELD_APPLY_MAP.get(keyVal[0]).accept(configure, keyVal[1]);
        }
        return configure;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getTargetIp() {
        return targetIp;
    }

    public void setTargetIp(String targetIp) {
        this.targetIp = targetIp;
    }

    public int getTargetPort() {
        return targetPort;
    }

    public void setTargetPort(int targetPort) {
        this.targetPort = targetPort;
    }

    public String getAgentJar() {
        return agentJar;
    }

    public void setAgentJar(String agentJar) {
        this.agentJar = agentJar;
    }

    public String getCoreJar() {
        return coreJar;
    }

    public void setCoreJar(String coreJar) {
        this.coreJar = coreJar;
    }

}
