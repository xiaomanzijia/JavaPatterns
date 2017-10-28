package com.example.licheng.lcdemo.patterm.state.demo3;

/**
 * Created by changyuan on 2017/10/28.
 */

public class MiddleState extends State {

    public MiddleState(State state) {
        this.acc = state.acc;
        this.point = state.getPoint();
        this.stateName = "高手";
    }


    public void writeNote(int score) {
        System.out.println(acc.getName() + "发布留言" + "， 增加" + score + "*2积分");
        this.point += score * 2;
        checkState(score);
        System.out.println("剩余积分为：" + this.point + "，当前级别为：" + acc.getState().stateName + "。");
    }

    @Override
    public void checkState(int score) {
        if(point >= 1000) {
            acc.setState(new HighState(this));
        } else if(point < 0) {
            System.out.println("余额不足，文件下载失败！");
            this.point+=score;
        } else if (point <= 100){
            acc.setState(new PrimaryState(this));
        }
    }
}
