package ProxyPattern1;
//游戏玩家主题接口
public interface IGamePlayer {
    //登录游戏
    public void login(String username, String password);

    //击杀Boss
    public void killBoss();

    //升级
    public void upGrade();
}