package proxypattern.aop;

/**
 * Created by licheng on 26/6/16.
 */
public class WorkServiceImpl implements  WorkService {

    @Override
    public String work() {
        return "work success";
    }

    @Override
    public String sleep() {
        return "sleep success";
    }

}
