package adapterpattern;

/**
 * Created by licheng on 12/3/16.
 */
public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();

        //不装在适配器
        Target target = new Adapter();
        target.request();

        System.out.println("\n----转载适配器之后----\n");

        //装载适配器
        Target target1 = new Adapter(adaptee);
        target1.request();
    }
}
