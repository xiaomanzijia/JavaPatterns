package com.example.licheng.lcdemo.patterm.state.demo2;

/**
 * Created by changyuan on 2017/10/28.
 */

public class OffState extends State {

    @Override
    public void on(ISwitch s) {
        System.out.println(s.getClass().getSimpleName() + " 打开");
        s.setState(s.getState("on"));
    }

    @Override
    public void off(ISwitch s) {
        System.out.println(s.getClass().getSimpleName() + " 已经关闭");
    }
}
