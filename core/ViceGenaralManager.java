package com.example.licheng.lcdemo.patterm.state.core;

/**
 * Created by changyuan on 2017/11/11.
 */

public class ViceGenaralManager extends Leader {

    public ViceGenaralManager(String name) {
        super(name);
    }

    @Override
    protected void handleRequest(LeaveRequest request) {
        if(request.getLeaveDays()<20)
        {
            System.out.println("副总经理" + name + "审批员工" + request.getLeaveName() + "的请假条，请假天数为" + request.getLeaveDays() + "天。");
        }
        else
        {
            if(this.successor!=null)
            {
                this.successor.handleRequest(request);
            }
        }
    }

}
