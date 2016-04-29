package fanxing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by licheng on 29/4/16.
 */
public class FanxingTest {
    public static void main(String[] args) {
        GenericClass<String> g1 = new GenericClass<String>();
        g1.print("hello");
        GenericClass<Integer> g2 = new GenericClass<Integer>();
        g2.print(4);


        System.out.println("-----------------------------");

        //测试泛型通配符
        List<String> list1 = new ArrayList<String>();
        list1.add("aaa");
        list1.add("bbb");
        list1.add("ccc");
        g1.printList(list1);
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        g1.printList(list2);

        System.out.println("-----------------------------");

        //测试泛型上限  不用强制转换
        Cavas cavas = new Cavas();

        List<Retangle> retangles = new ArrayList<Retangle>();
        retangles.add(new Retangle());

        List<Circle> circles = new ArrayList<Circle>();
        circles.add(new Circle());
        circles.add(new Circle());

        cavas.draw(retangles);
        cavas.draw(circles);

        System.out.println("-----------测试泛型方法------------------");
        GenericMethod method = new GenericMethod();
        method.printList(list1);
        method.printList(list2);

        System.out.println("-----------泛型方法类型指定------------------");
        System.out.println(GenericMethod.compare(2,3));
        System.out.println(GenericMethod.compare("df","ae"));

    }
}
