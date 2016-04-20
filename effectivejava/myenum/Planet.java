package effectivejava.mutiparamsconstructor.myenum;

/**
 * Created by licheng on 20/4/16.
 */
public enum Planet {
    MERCURY(3.302e+23, 2.439e6),
    VENUS(4.869e+24, 6.052e6),
    EARTH(5.975e+24, 6.378e6),
    MARS(6.419e+23, 3.393e6);
    private final double mass;
    private final double redius;
    private final double surfaceGravity;

    private final static double G = 6.67300E-11;

    Planet(double redius, double mass) {
        this.redius = redius;
        this.mass = mass;
        surfaceGravity = G * mass / (redius * redius);
    }

    public double mass(){return mass;}
    public double redius(){return redius;}
    public double surfaceGravity(){return surfaceGravity;}

    public double surfaceWeight(double mass){
        return mass * surfaceGravity;
    }
}
