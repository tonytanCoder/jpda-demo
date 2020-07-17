package com.jpda.jpdademo.proxy;

public class User {
    private void methodPublic1() {
        System.out.println("methodPublic1");
    }

    private void methodPublic2(String a) {
        System.out.println(a+"========methodPublic2");
    }

    private void defaultMethod1(int b) {
        System.out.println(b+"========defaultMethod1");
    }

    private void defaultMethod2() {
        System.out.println("defaultMethod2");
    }
}
