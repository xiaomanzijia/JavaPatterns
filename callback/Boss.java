package effectivejava.mutiparamsconstructor.callback;

/**
 * Created by licheng on 10/4/16.
 */
public class Boss implements CallBack {

    public Boss(Personer personer) {
        personer.doSomething(this,"扫地");
    }

    @Override
    public void backResult(String result) {
        System.out.println("事情"+result);
    }
}
