package adapterpattern;

/**
 * Created by licheng on 12/3/16.
 */
public class Adapter implements Target {

    Adaptee adaptee;


    public Adapter() {
    }

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        if(adaptee != null){
            adaptee.specialRequest();
        }else {
            System.out.println("普通功能");
        }
    }
}
