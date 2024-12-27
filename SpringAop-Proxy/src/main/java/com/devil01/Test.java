package com.devil01;

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
        //小明想租房
        XioaMing xioaMing = new XioaMing();

        //找个一个代理人  房产中介
        RoomProxy roomProxy = new RoomProxy(xioaMing);

        //找房
        roomProxy.seekRoom();
        //看法
        roomProxy.watchRoom();
        //租房
        roomProxy.Room();
        //完成
        roomProxy.finish();
    }
}
