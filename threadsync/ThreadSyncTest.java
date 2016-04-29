package threadsync;

/**
 * Created by licheng on 24/4/16.
 */
public class ThreadSyncTest {
    public static void main(String[] args) {
        Info info = new Info(); // 实例化Info对象
        Producer pro = new Producer(info) ; // 生产者
        Customer con = new Customer(info) ; // 消费者
        new Thread(pro).start() ;
        new Thread(con).start() ;
    }
}
