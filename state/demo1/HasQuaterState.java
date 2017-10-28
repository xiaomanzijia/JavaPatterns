package com.example.licheng.lcdemo.patterm.state.demo1;

/**
 * Created by changyuan on 2017/10/27.
 */

public class HasQuaterState implements State {

    GumballMachine gumballMachine;

    public HasQuaterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuater() {

    }

    @Override
    public void ejectQuater() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

    }
}
