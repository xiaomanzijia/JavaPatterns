package effectivejava.mutiparamsconstructor.callback;

/**
 * Created by licheng on 10/4/16.
 */
public class Personer {
    public void doSomething(CallBack callBack, String task){
        if(callBack instanceof Boss){
            System.out.println("老板要你"+task);
            String result = "做完了";
            callBack.backResult(result);
        }else if (callBack instanceof Manager){
            System.out.println("总经理要你"+task);
            String result = "做完了";
            callBack.backResult(result);
        }
    }
}
