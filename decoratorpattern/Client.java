package decoratorpattern;

/**
 * Created by licheng on 16/3/16.
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Decorator decorator = new ConcreteDecoratorA(new ConcreteDecoratorB(component));
        decorator.operation1();
        decorator.operation2();
    }
}
