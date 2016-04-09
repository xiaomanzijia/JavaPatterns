package effectivejava.mutiparamsconstructor.callback;

/**
 * Created by licheng on 10/4/16.
 */
public class Manager implements CallBack {

    public Manager(Personer personer) {
        personer.doSomething(this,"倒杯水");
    }

    @Override
    public void backResult(String result) {
        System.out.println("事情"+result);
    }
}
