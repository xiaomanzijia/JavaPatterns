package fanxing;

import java.util.Comparator;
import java.util.List;

/**
 * Created by licheng on 29/4/16.
 */
public class GenericMethod {
    public <T> void printList(List<T> list){
        for (T t : list){
            System.out.print(t+" ");
        }
        System.out.println();
    }

    public static <T extends Comparable> T compare(T t1, T t2){
        return t1.compareTo(t2) > 0 ? t1 : t2;
    }
}
