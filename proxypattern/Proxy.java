package proxypattern;

/**
 * Created by licheng on 18/3/16.
 */
public class Proxy implements Subject{

    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    public void preRequest(){
        System.out.println("代理前...");
    }

    public void afterRequest(){
        System.out.println("代理后...");
    }

    @Override
    public void request() {
        preRequest();
        subject.request();
        afterRequest();
    }
}
