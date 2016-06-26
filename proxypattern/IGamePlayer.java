package proxypattern;

/**
 * Created by licheng on 26/6/16.
 * 强制代理 《设计模式之禅》
 */
public interface IGamePlayer {
    void login(String username, String password);
    void killBoss();
    void upgrade();
    IGamePlayer getProxy();
}
