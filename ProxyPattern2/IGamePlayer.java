package ProxyPattern2;

/**
 * 普通代理模式：就是我们要知道代理的存在，然后才能访问(或者使用代理)。
 * 对于基本的代理改动较小。只改变实现类中
 * @author yemaozi
 */
public interface IGamePlayer {
    //登录游戏
    public void login(String username, String password);

    //击杀Boss
    public void killBoss();

    //升级
    public void upGrade();
}