package com.example.licheng.lcdemo.patterm.state.demo2;

/**
 * Created by changyuan on 2017/10/28.
 */

public class OnState extends State {
    @Override
    public void on(ISwitch s) {
        System.out.println(s.getClass().getSimpleName() + " 已经打开");
    }

    @Override
    public void off(ISwitch s) {
        System.out.println(s.getClass().getSimpleName() + " 关闭");
        s.setState(s.getState("off"));
    }
}
