package effectivejava.mutiparamsconstructor.equals;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by licheng on 18/4/16.
 */
public class EqualTest {
    public static void main(String[] args) {
        //测试对称性
//        CaseInsesitiveString str = new CaseInsesitiveString("Hello");
//        String s = "hello";
//        System.out.println(str.equals(s));
//        System.out.println(s.equals(str));
//
//        List<CaseInsesitiveString> list = new ArrayList<CaseInsesitiveString>();
//        list.add(str);
//        System.out.println(list.contains(s));

          //测试传递性
//        ColorPoint point = new ColorPoint(1,2,Color.BLUE);
//        Point p = new Point(1,2);
//        ColorPoint colorPoint = new ColorPoint(1,2, Color.RED);
//        System.out.println(point.equals(p));
//        System.out.println(p.equals(colorPoint));
//        System.out.println(point.equals(colorPoint));

        ColorPointNew p1 = new ColorPointNew(1,2,Color.BLUE);
        Point p2 = new Point(1,2);
        ColorPointNew p3 = new ColorPointNew(1,2,Color.BLUE);
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
        System.out.println(p1.equals(p3));
    }
}
