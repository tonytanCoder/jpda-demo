package com.jpda.jpdademo.proxy;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class UserMethodInterceptor  implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] arg,
                            MethodProxy proxy) throws Throwable {
        System.out.println("before:"+method.getName());
        Object object = proxy.invokeSuper(obj, arg);
        System.out.println("after:"+method.getName());
        return object;
    }

}