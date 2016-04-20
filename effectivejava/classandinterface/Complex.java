package effectivejava.mutiparamsconstructor.classandinterface;

/**
 * Created by licheng on 20/4/16.
 */
public final class Complex {
    private final double re;
    private final double im;

    public Complex(double im, double re) {
        this.im = im;
        this.re = re;
    }

    public double realPart(){
        return im;
    }

    public double imaginaryPart(){
        return re;
    }

    public Complex add(Complex c){
        return new Complex(re + c.re, im + c.im);
    }

    public Complex subtract(Complex c){
        return new Complex(re - c.re, im - c.im);
    }

    public Complex motiply(Complex c){
        return new Complex(re * c.re - im * c.im, re * c.re + im * c.im);
    }

    public Complex divide(Complex c){
        double temp = im * c.im + re * c.re;
        return new Complex((re * c.re + im * c.im) / temp, (re * c.re - im * c.im) / temp);
    }

    @Override
    public int hashCode() {
        int result = 17 + hashDouble(re);
        result = 31 * result + hashDouble(im);
        return result;
    }

    private int hashDouble(double val){
        long longBits = Double.doubleToLongBits(val);
        return (int)(longBits ^ (longBits >>> 32));
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this)
            return true;
        if(!(obj instanceof Complex))
            return false;
        Complex c = (Complex) obj;
        return Double.compare(im, c.im) == 0 &&
                Double.compare(re , c.re) == 0;
    }

    @Override
    public String toString() {
        return "+ re + " + re +" + im + " + im;
    }
}
