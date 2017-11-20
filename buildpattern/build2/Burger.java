package com.example.licheng.lcdemo.patterm.state.build;

/**
 * Created by changyuan on 2017/11/20.
 */

public abstract class Burger implements Item {

    @Override
    public Packing pack() {
        return new Wrapper();
    }

    @Override
    public abstract Double price();

}
