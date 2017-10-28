package com.example.licheng.lcdemo.patterm.state.demo2;

/**
 * 状态模式示例二
 * Created by changyuan on 2017/10/28.
 */

public class Switch implements ISwitch {
    private static State state, onState, offState;
    private String name;

    public Switch(String name) {
        this.name = name;
        onState = new OnState();
        offState = new OffState();
        state = onState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void on() {
        System.out.println(name);
        state.on(this);
    }

    public void off() {
        System.out.println(name);
        state.off(this);
    }

    public State getState(String type) {
        if(type.equalsIgnoreCase("on")) {
            return onState;
        } else {
            return offState;
        }
    }
}
