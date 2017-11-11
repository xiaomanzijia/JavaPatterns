package com.example.licheng.lcdemo.patterm.state.core;

/**
 * Created by changyuan on 2017/11/11.
 */

public abstract class Leader {

    protected String name;
    protected Leader successor;

    public Leader(String name) {
        this.name = name;
    }

    public void setSuccessor(Leader successor) {
        this.successor = successor;
    }

    protected abstract void handleRequest(LeaveRequest request);
}
