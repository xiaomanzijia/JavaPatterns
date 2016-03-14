package singlepattern;

/**
 * Created by licheng on 12/3/16.
 */
public class SinglePattern {

    private SinglePattern() {
    }

    private static SinglePattern instance = new SinglePattern();

    public static SinglePattern getInstance() {
        return instance;
    }

//    //静态内部类
//    private static class Holder {
//        private final static SinglePattern INSTANCE = new SinglePattern();
//    }

//    public static final SinglePattern getInstance() {
//        return Holder.INSTANCE;
//    }


//    //双重检查锁定
//    public static SinglePattern getInstance() {
//        if (instance == null) {
//            synchronized (SinglePattern.class) {
//                if (instance == null) {
//                    instance = new SinglePattern();
//                }
//            }
//        }
//        return instance;
//    }



//    //加入synchronized同步是为了线程安全
//    public static synchronized SinglePattern getInstance() {
//        if (instance == null) {
//            instance = new SinglePattern();
//        }
//        return instance;
//    }






}
