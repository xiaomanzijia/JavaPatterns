package observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by licheng on 17/3/16.
 */
public abstract class Subject {
    private List<Observer> observerList = new ArrayList<Observer>();

    //添加observer
    public void attach(Observer observer){
        if(observer != null){
            observerList.add(observer);
        }
    }

    //移除observer
    public void detach(Observer observer){
        if(observer != null){
            observerList.remove(observer);
        }
    }

    //通知更新
    public void notifyObserver(String state){
        for (Observer observer : observerList){
            observer.update(state);
        }
    }
}
