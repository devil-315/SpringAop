package com.devil03_CGLIB动态代理;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/9/8
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //真实角色
        UserDao userDao = new UserDao();

        //代理角色 ==> 不存在
        ProxyFactory proxyFactory = new ProxyFactory(userDao);

        //动态生成代理类
        UserDao proxy = (UserDao) proxyFactory.getProxy();
        proxy.save();
    }
}
