package ProxyPattern4;
/*
 * 动态代理：就是实现阶段不用关系代理是哪个，而在运行阶段指定具体哪个代理。
 */
public interface IGamePlayer {
    //登录游戏
    public void login(String username, String password);

    //击杀Boss
    public void killBoss();

    //升级
    public void upGrade();
}