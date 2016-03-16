package decoratorpattern;

/**
 * Created by licheng on 16/3/16.
 */
public class ConcreteComponent implements Component {

    @Override
    public void operation1() {
        System.out.println("被装饰者自带方法一");
    }

    @Override
    public void operation2() {
        System.out.println("被装饰者自带方法二");
    }
}
