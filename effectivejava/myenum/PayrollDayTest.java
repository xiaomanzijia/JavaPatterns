package effectivejava.mutiparamsconstructor.myenum;

/**
 * Created by licheng on 20/4/16.
 */
public class PayrollDayTest {
    public static void main(String[] args) {
        for(PayrollDay p : PayrollDay.values()){
            System.out.println(p.pay(10,100));
        }
    }
}
