package fanxing;

/**
 * Created by licheng on 29/4/16.
 */
public interface InterfaceGeneric<T> {
    T getT();
    void save(T t);
}
