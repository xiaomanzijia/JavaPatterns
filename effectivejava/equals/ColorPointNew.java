package effectivejava.mutiparamsconstructor.equals;

import java.awt.Color;

/**
 * Created by licheng on 18/4/16.
 */
public class ColorPointNew {

    private final Point point;
    private final Color color;

    public ColorPointNew(int x, int y, Color color) {
        if(color == null){
            throw new NullPointerException();
        }
        this.color = color;
        point = new Point(x,y);
    }



    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof ColorPointNew))
            return false;
        ColorPointNew point = (ColorPointNew) obj;
        return point.point.equals(point) &&
                point.color == color;
    }

    public Point asPoint(){
        return point;
    }
}
