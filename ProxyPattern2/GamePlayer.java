package ProxyPattern2;

public class GamePlayer implements IGamePlayer{

    private String name = "";

    //通过构造方法，将代理传递进来。
    public GamePlayer(IGamePlayer proxyGp, String name){
        if(proxyGp == null){
            //处理非正常情况。
        }else{
            this.name = name;
        }
    }
    //登录游戏
    public void login(String username, String password) {
        System.out.println("登录名为 "+username+" 进入游戏，" + name + " 登录成功！");
    }
    //杀Boss
    public void killBoss() {
        System.out.println(this.name + " 击杀了Boss！");
    }

    //升级
    public void upGrade() {
        System.out.println(this.name + "升级了！");
    }

}