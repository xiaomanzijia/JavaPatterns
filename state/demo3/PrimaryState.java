package com.example.licheng.lcdemo.patterm.state.demo3;

/**
 * Created by changyuan on 2017/10/28.
 */

public class PrimaryState extends State {

    public PrimaryState(State state) {
        this.acc = state.acc;
        this.point = state.getPoint();
        this.stateName = "新手";
    }

    public PrimaryState(ForumAccount account) {
        this.acc = account;
        this.point = 0;
        this.stateName = "新手";
    }

    public void downloadFile(int score) {
        System.out.println("对不起，" + acc.getName() + "你没有下载文件的权限");
    }


    @Override
    public void checkState(int score) {
        if(point >= 1000) {
            acc.setState(new HighState(this));
        } else if(point >= 100){
            acc.setState(new MiddleState(this));
        }
    }
}
