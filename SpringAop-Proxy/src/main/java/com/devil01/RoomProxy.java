package com.devil01;

/**
 * ClassName：RoomProxy
 *
 * @author: Devil
 * @Date: 2024/9/8
 * @Description:
 * @version: 1.0
 */
//代理人  中介
public class RoomProxy implements Room {
    private XioaMing xioaMing;

    public RoomProxy(XioaMing xioaMing) {
        this.xioaMing = xioaMing;
    }

    @Override
    public void seekRoom() {
        xioaMing.seekRoom();
    }

    @Override
    public void watchRoom() {
        xioaMing.watchRoom();
    }

    @Override
    public void Room() {
        xioaMing.Room();
    }

    @Override
    public void finish() {
        xioaMing.finish();
    }
}
