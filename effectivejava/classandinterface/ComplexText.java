package effectivejava.mutiparamsconstructor.classandinterface;

/**
 * Created by licheng on 20/4/16.
 */
public class ComplexText {
    public static void main(String[] args) {
        Complex complex = new Complex(1.0,2.0);
        Complex complex1 = new Complex(2.0,3.0);
        System.out.println(complex.add(complex1));
        System.out.println(complex.divide(complex1));
        System.out.println(complex.subtract(complex1));
        System.out.println(complex.motiply(complex1));
    }
}
