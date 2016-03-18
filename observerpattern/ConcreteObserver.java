package observerpattern;

/**
 * Created by licheng on 18/3/16.
 */
public class ConcreteObserver implements Observer {

    private String observerState;

    @Override
    public void update(String state) {
        //更新观察者的状态
        observerState = state;
        System.out.println("ConcreteObserver 监听最新状态："+observerState);
    }
}
