package com.devil02_jdk动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ClassName：ProxyInvocationHandler
 *
 * @author: Devil
 * @Date: 2024/9/8
 * @Description:
 * @version: 1.0
 */
//生成代理类
public class ProxyInvocationHandler implements InvocationHandler {
    //被代理角色
    private Object target;

    public ProxyInvocationHandler(Object target) {
        this.target = target;
    }

    /*
    * ClassLoader loader: 类加载器，目标对象的类加载器 object.getClass().getClassLoader()
    *  Class[] interfaces:目标对象所实现的接口
    * InvocationHandler h : 是一个增强目标方法的接口
    * */
    //生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    /*
    * proxy:代理对象
    * method:方法对象
    * args:参数列表
    * */
    //处理代理类，返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName());
        Object invoke = method.invoke(target, args);

        return invoke;
    }
}
