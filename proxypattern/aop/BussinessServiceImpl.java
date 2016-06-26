package proxypattern.aop;

/**
 * Created by licheng on 26/6/16.
 */
public class BussinessServiceImpl implements BussinessService {



    @Override
    public String login(String username, String pwd) {
        return "login success";
    }

    @Override
    public String find() {
        return "find success";
    }


}
