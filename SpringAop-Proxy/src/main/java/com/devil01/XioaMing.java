package com.devil01;

/**
 * ClassName：XioaMing
 *
 * @author: Devil
 * @Date: 2024/9/8
 * @Description:
 * @version: 1.0
 */
//被代理人    想要租房的人
public class XioaMing implements Room{
    @Override
    public void seekRoom() {
        System.out.println("找房");
    }

    @Override
    public void watchRoom() {
        System.out.println("看房");
    }

    @Override
    public void Room() {
        System.out.println("租房");
    }

    @Override
    public void finish() {
        System.out.println("完成租房");
    }
}
