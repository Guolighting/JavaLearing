package ProxyPattern1;
//代理类
//代理也是个游戏玩家，所以也要实现IGamePlayer
public class ProxyGamePlayer implements IGamePlayer{
    private IGamePlayer proxyGp = null;
    //代理需要获取被代理的信息,就是执行被代理所要执行的方法，
    //所以要获取被代理的对象。这里通过构造方法获取。
    public ProxyGamePlayer(GamePlayer gp){
        this.proxyGp = gp;
    }
    public void login(String username, String password) {
        System.out.println("代理登录的游戏！");
        proxyGp.login(username, password);
    }
    public void killBoss() {
        proxyGp.killBoss();
    }
    public void upGrade() {
        proxyGp.upGrade();
    }
}