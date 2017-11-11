package com.example.licheng.lcdemo.patterm.state.flyweight;

/**
 * Created by changyuan on 2017/11/11.
 */

public class Switch implements NetworkDevice {

    private String type;

    public Switch(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void use() {
        System.out.println("Linked by switch, type is " + this.type);
    }
}
