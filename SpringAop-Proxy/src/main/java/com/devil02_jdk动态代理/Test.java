package com.devil02_jdk动态代理;

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
        UserServiceImpl userService = new UserServiceImpl();

        //此时没用代理类（中介），去生成代理类
        ProxyInvocationHandler handler = new ProxyInvocationHandler(userService);

        //动态生成代理角色（中介）
        UserService proxy = (UserService) handler.getProxy();
        proxy.add();


    }
}
