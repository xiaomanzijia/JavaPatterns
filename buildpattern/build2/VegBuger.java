package com.example.licheng.lcdemo.patterm.state.build;

/**
 * Created by changyuan on 2017/11/20.
 */

public class VegBuger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public Double price() {
        return 25.0d;
    }
}
