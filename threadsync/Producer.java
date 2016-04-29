package threadsync;

/**
 * Created by licheng on 24/4/16.
 */
public class Producer implements Runnable {
    private Info info = null ;  // 保存Info引用
    public Producer(Info info){
        this.info = info ;
    }
    public void run(){
        boolean flag = false ; // 定义标记位
        for(int i=0;i<50;i++){
            if(flag){
                this.info.set("李兴华","JAVA讲师") ; // 设置名称
                flag = false ;
            }else{
                this.info.set("mldn","www.mldnjava.cn") ; // 设置名称
                flag = true ;
            }
        }
    }
}
