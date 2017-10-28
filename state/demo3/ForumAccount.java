package com.example.licheng.lcdemo.patterm.state.demo3;

/**
 * Created by changyuan on 2017/10/28.
 */

public class ForumAccount {
    private State state;
    private String name;

    public ForumAccount(String name) {
        this.name = name;
        this.state = new PrimaryState(this);
    }

    public void writeNote(int score)
    {
        state.writeNote(score);
    }

    public void replyNote(int score)
    {
        state.replyNote(score);
    }

    public void downloadFile(int score) {
        state.downloadFile(score);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
