package com.example.licheng.lcdemo.patterm.state.build;

/**
 * Created by changyuan on 2017/11/20.
 */

public abstract class ColdDrink implements Item {

    @Override
    public abstract Double price();

    @Override
    public Packing pack() {
        return new Bottle();
    }
}
