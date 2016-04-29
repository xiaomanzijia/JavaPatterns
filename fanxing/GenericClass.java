package fanxing;

import java.util.List;

/**
 * Created by licheng on 29/4/16.
 */
public class GenericClass<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void print(T t){
        System.out.println(t);
    }

    public void printList(List<?> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }

}
