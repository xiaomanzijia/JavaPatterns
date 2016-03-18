package observerpattern;

/**
 * Created by licheng on 18/3/16.
 */
public class ConcreteObserver1 implements Observer {

    private String newState;

    @Override
    public void update(String state) {
        newState = state;
        System.out.println("ConcreteObserver1 监听最新状态："+newState);
    }
}
