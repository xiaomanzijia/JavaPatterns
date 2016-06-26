package proxypattern.aop;

import javax.xml.ws.handler.LogicalHandler;

/**
 * Created by licheng on 26/6/16.
 */
public class AopClient {
    public static void main(String[] args) {

        BussinessService bs = LogInvoHandler.getProxyInstance(BussinessServiceImpl.class);
        bs.login("zhangsan","123456");
        bs.find();

        WorkService ws = LogInvoHandler.getProxyInstance(WorkServiceImpl.class);
        ws.work();
        ws.sleep();

        BussinessService bss = LogInvoHandler.getProxyInstance(BussinessServiceImpl.class);
        bss.login("xiaomin","password");
        bss.find();


    }
}
