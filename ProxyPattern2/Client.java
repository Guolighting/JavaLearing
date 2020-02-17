package ProxyPattern2;

/**
 * 普通代理模式，它不用知道代理的真实角色是谁，屏蔽了真实角色的更变对高层模块的影响。
 * (本例中，就是，不用知道为谁代练游戏，只需要知道代练游戏的用户名，密码即可。)
 * @author yemaozi
 *
 */
public class Client {
    public static void main(String[] args){
        IGamePlayer proxyGp = new ProxyGamePlayer("张三");
        proxyGp.login("zhangsan", "123456");
        proxyGp.killBoss();
        proxyGp.upGrade();
    }
}