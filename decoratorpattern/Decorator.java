package decoratorpattern;

/**
 * Created by licheng on 16/3/16.
 */
public abstract class Decorator implements Component{

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operation1(){
        component.operation1();
    }

    @Override
    public void operation2() {
        component.operation2();
    }

}
