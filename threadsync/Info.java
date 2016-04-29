package threadsync;

import sun.rmi.runtime.Log;

/**
 * Created by licheng on 24/4/16.
 */
public class Info {
    private String name = "李兴华jj";  // 定义name属性
    private String content = "JAVA讲师"  ;  // 定义content属性
    private boolean flag = false ; // 设置标志位


    public synchronized void set(String name,String content){
        System.out.println("set  "+flag);
        if(!flag){
            try{
                wait() ;
            }catch(InterruptedException e){
                e.printStackTrace() ;
            }
        }
        this.setName(name) ; // 设置名称
//        try{
//            Thread.sleep(300) ;
//        }catch(InterruptedException e){
//            e.printStackTrace() ;
//        }
        this.setContent(content) ; // 设置内容
        flag  = false ; // 改变标志位，表示可以取走
        notify() ; //唤醒get
    }

    public synchronized void get(){
        System.out.println("get  "+flag);
        if(flag){
            try{
                wait() ;
            }catch(InterruptedException e){
                e.printStackTrace() ;
            }
        }
        try{
            Thread.sleep(3000) ;
        }catch(InterruptedException e){
            e.printStackTrace() ;
        }
        System.out.println(this.getName() +
                " --> " + this.getContent()) ;
        flag  = true ; // 改变标志位，表示可以生产
        notify() ; //唤醒set
    }
    public void setName(String name){
        this.name = name ;
    }
    public void setContent(String content){
        this.content = content ;
    }
    public String getName(){
        return this.name ;
    }
    public String getContent(){
        return this.content ;
    }
}
