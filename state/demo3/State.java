package com.example.licheng.lcdemo.patterm.state.demo3;

/**
 * Created by changyuan on 2017/10/28.
 */

public abstract class State {
    protected ForumAccount acc;
    protected int point;
    protected String stateName;

    public abstract void checkState(int score);

    public void downloadFile(int score) {
        System.out.println("下载扣除 " + score + " 积分");
        this.point -= score;
        checkState(score);
        System.out.println("剩余积分为 " + this.point + " 当前级别为 " + acc.getState().getStateName());
    }

    public void writeNote(int score) {
        System.out.println(acc.getName() + "发布留言" + "，增加" + score + "积分。");
        this.point += score;
        checkState(score);
        System.out.println("剩余积分为：" + this.point + "，当前级别为：" + acc.getState().stateName + "。");
    }

    public void replyNote(int score) {
        System.out.println(acc.getName() + "回复留言，增加" + score + "积分。");
        this.point += score;
        checkState(score);
        System.out.println("剩余积分为：" + this.point + "，当前级别为：" + acc.getState().stateName + "。");
    }


    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}
