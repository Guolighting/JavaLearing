package ProxyPattern2;
public class ProxyGamePlayer implements IGamePlayer{
    private IGamePlayer proxyGp = null;
    public ProxyGamePlayer(String name){

        try {
            //通过构造方法创建GamePlayer，同时将自己传递进去。用于在GamePlayer判断业务逻辑
            proxyGp = new GamePlayer(this, name);
        } catch (Exception e) {
            e.printStackTrace();
        }
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