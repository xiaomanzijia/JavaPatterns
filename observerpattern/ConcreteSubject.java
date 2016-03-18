package observerpattern;

/**
 * Created by licheng on 17/3/16.
 */
public class ConcreteSubject extends Subject {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("主题状态重新更改为：" + state);
        //状态发生改变 通知各个观察者
        this.notifyObserver(state);
    }

}
