package proxypattern.aop;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by licheng on 26/6/16.
 */
public class LogInvoHandler implements InvocationHandler {

    private Object target; //代理目标
    private Object proxy; //代理对象

    //存储LogInvoHandler对象
    private static HashMap<Class<?>, LogInvoHandler> invoHandlers = new HashMap<Class<?>, LogInvoHandler>();


    public LogInvoHandler() {
    }

    //通过class生成动态代理proxy
    public synchronized static<T> T getProxyInstance(Class<T> clazz){
        LogInvoHandler invoHandler = invoHandlers.get(clazz);

        if(null == invoHandler){
            invoHandler = new LogInvoHandler();
            try {
                T tar = clazz.newInstance();
                invoHandler.setTarget(tar);
                invoHandler.setProxy(Proxy.newProxyInstance(tar.getClass().getClassLoader(),
                        tar.getClass().getInterfaces(), invoHandler));

            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            invoHandlers.put(clazz, invoHandler);
        }

        return (T) invoHandler.getProxy();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = method.invoke(target, args); //执行业务逻辑

        System.out.println("__invoke method:" + method.getName() +
                "; args:" + ((null == args) ? "null" : Arrays.asList(args).toString()) +
                "; return: " + result);


        return result;
    }


    public Object getProxy() {
        return proxy;
    }

    public Object getTarget() {
        return target;
    }

    public void setProxy(Object proxy) {
        this.proxy = proxy;
    }

    public void setTarget(Object target) {
        this.target = target;
    }
}
