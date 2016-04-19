package effectivejava.mutiparamsconstructor.equals;

import java.awt.Color;

/**
 * Created by licheng on 18/4/16.
 */
public class ColorPoint extends Point {

    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Point))
            return false;
        if(!(obj instanceof ColorPoint))
            return obj.equals(this);
        return super.equals(obj) && ((ColorPoint) obj).color == color;
    }
}
