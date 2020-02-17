package ProxyPattern1;

//代理客户端
public class BasePoxyClient {
    public static void main(String[] args){
        IGamePlayer proxyGp = new ProxyGamePlayer(new GamePlayer("张三"));
        proxyGp.login("zhangsan", "123456");
        proxyGp.killBoss();
        proxyGp.upGrade();
    }
}