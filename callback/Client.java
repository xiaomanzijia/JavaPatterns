package effectivejava.mutiparamsconstructor.callback;

/**
 * Created by licheng on 10/4/16.
 */
public class Client {
    public static void main(String[] args) {
        Personer personer = new Personer();
        new Manager(personer);
        new Boss(personer);
    }
}
