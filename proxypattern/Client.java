package proxypattern;

/**
 * Created by licheng on 18/3/16.
 */
public class Client {
    public static void main(String[] args) {
        //实例代理对象
        Subject subject = new ConcreteSubject();
        //对象代理
        Proxy proxy = new Proxy(subject);
        //代理结果
        proxy.request();
    }
}
