package effectivejava.mutiparamsconstructor.myenum;

/**
 * Created by licheng on 20/4/16.
 */
public class PlanetTest {
    public static void main(String[] args) {
        double earthWeight = Double.parseDouble("15");
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for (Planet p : Planet.values()){
            System.out.printf("Wegiht on %s is %f\n",p, p.surfaceWeight(mass));
        }
    }
}
