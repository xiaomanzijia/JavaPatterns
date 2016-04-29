package threadsync;

/**
 * Created by licheng on 24/4/16.
 */
public class Customer implements Runnable {
    private Info info = null ;
    public Customer(Info info){
        this.info = info ;
    }
    public void run(){
        for(int i=0;i<50;i++){
            this.info.get() ;
        }
    }
}
