package effectivejava.mutiparamsconstructor.myenum;

/**
 * Created by licheng on 20/4/16.
 */
public class OperationTest {
    public static void main(String[] args) {
        double x = 1.0;
        double y = 2.0;
        for (Operation o : Operation.values()){
            System.out.printf("%f %s %f = %f\n",x, o , y , o.apply(x,y));
        }
    }
}
