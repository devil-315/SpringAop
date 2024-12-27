package com.devil03_CGLIB动态代理;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * ClassName：ProxyFactory
 *
 * @author: Devil
 * @Date: 2024/9/8
 * @Description:
 * @version: 1.0
 */
//代理对象
public class ProxyFactory implements MethodInterceptor {
    //被代理角色
    private Object target;

    public ProxyFactory(Object target){
        this.target = target;
    }

    //生成代理类
    public Object getProxy(){
        //工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());

        //设置回调函数
        enhancer.setCallback(this);

        //创建子类对象
        return enhancer.create();
    }

    //处理代理类，返回结果
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object invoke = method.invoke(target, objects);
        return invoke;
    }
}
