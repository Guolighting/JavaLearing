package ProxyPattern1;
//这是正常的，用非代理的情况下。
public class Client {
    public static void main(String [] args){
        IGamePlayer gp = new GamePlayer("张三");
        //开始执行主题接口中的方法。
        //登录游戏
        gp.login("zhangsan", "123456");
        //杀怪
        gp.killBoss();
        //升级
        gp.upGrade();
    }
}