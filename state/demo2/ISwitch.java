package com.example.licheng.lcdemo.patterm.state.demo2;

/**
 * Created by changyuan on 2017/10/28.
 */

public interface ISwitch {
    void setState(State state);
    void on();
    void off();
    State getState(String type);
}
