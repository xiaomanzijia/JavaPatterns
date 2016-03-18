package proxypattern;


/**
 * Created by licheng on 18/3/16.
 */
public class ConcreteSubject implements Subject {
    @Override
    public void request() {
        System.out.println("代理...");
    }
}
