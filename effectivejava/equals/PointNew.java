package effectivejava.mutiparamsconstructor.equals;

/**
 * Created by licheng on 18/4/16.
 */
public class PointNew {
    private final int x;
    private final int y;

    public PointNew(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof PointNew))
            return false;
        PointNew p = (PointNew) obj;
        return p.x == x && p.y == y;
    }
}
