package com.example.licheng.lcdemo.patterm.state.demo1;

/**
 * Created by changyuan on 2017/10/27.
 */

public class NoQuarterState implements State {

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuater() {
        gumballMachine.setState(gumballMachine.getHasQuarterState());
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
