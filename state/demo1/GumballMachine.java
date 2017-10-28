package com.example.licheng.lcdemo.patterm.state.demo1;

/**
 * 状态模式 示例一
 * Created by changyuan on 2017/10/27.
 */

public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State state = soldOutState;
    int count = 0;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuaterState(this);
        soldState = new SoldState(this);
        this.count = numberGumballs;
        if(numberGumballs > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuater();
    }

    public void ejectQuarter() {
        state.ejectQuater();
    }

    public void turnCrank() {
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        if (count != 0) {
            count = count - 1;
        }
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }
}
