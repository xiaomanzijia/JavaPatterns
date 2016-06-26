package proxypattern;

/**
 * Created by licheng on 26/6/16.
 */
public class GamePlayer implements IGamePlayer {

    private String name = "";

    private IGamePlayer proxy;

    public GamePlayer(String name) {
        this.name = name;
    }


    @Override
    public void login(String username, String password) {
        if(isProxy()){
            System.out.println("登陆名为" + username + ",登陆密码为" + password);
        }else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void killBoss() {
        if(isProxy()){
            System.out.println(this.name + "在打怪");
        }else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void upgrade() {
        if(isProxy()){
            System.out.println(this.name + "又升了一级");
        }else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    public boolean isProxy(){
        if(this.proxy == null){
            return false;
        }else {
            return true;
        }
    }

}
