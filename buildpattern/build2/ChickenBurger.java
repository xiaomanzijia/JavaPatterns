package com.example.licheng.lcdemo.patterm.state.build;

/**
 * Created by changyuan on 2017/11/20.
 */

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public Double price() {
        return 16d;
    }
}
