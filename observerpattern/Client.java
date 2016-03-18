package observerpattern;

/**
 * Created by licheng on 18/3/16.
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        Observer observer1 = new ConcreteObserver1();
        //注册观察者
        subject.attach(observer);
        subject.attach(observer1);
        //改变主题的状态
        subject.setState("new state");
    }
}
