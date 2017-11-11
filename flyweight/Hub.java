package com.example.licheng.lcdemo.patterm.state.flyweight;

/**
 * Created by changyuan on 2017/11/11.
 */

public class Hub implements NetworkDevice {

    private String type;

    public Hub(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void use() {
        System.out.println("Linked by Hub, type is " + this.type);
    }
}
