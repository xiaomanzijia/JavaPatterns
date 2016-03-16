package decoratorpattern;

/**
 * Created by licheng on 16/3/16.
 */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    public void addBehavior1(){
        System.out.println("装饰器B装饰方法一");
    }

    public void addBehavior2(){
        System.out.println("装饰器B装饰方法二");
    }

    @Override
    public void operation1() {
        super.operation1();
        addBehavior1();
    }

    @Override
    public void operation2() {
        super.operation2();
        addBehavior2();
    }
}
