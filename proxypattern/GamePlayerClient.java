package proxypattern;

/**
 * Created by licheng on 26/6/16.
 * 强制代理
 */
public class GamePlayerClient {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
//        IGamePlayer proxy = new GamePlayerProxy(player);
        IGamePlayer proxy = player.getProxy();
        proxy.login("张三","123456");
        proxy.killBoss();
        proxy.upgrade();
    }
}
