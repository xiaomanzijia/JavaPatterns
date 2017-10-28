package com.example.licheng.lcdemo.patterm.state.demo2;

/**
 * Created by changyuan on 2017/10/28.
 */

abstract class State {
    public abstract void on(ISwitch s);
    public abstract void off(ISwitch s);
}
