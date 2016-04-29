package fanxing;

import java.util.List;

/**
 * Created by licheng on 29/4/16.
 */
public class Cavas {
    public void draw(List< ? extends Shape> list){
        for (Shape shape : list){
            shape.draw();
        }
    }
}
