package ProxypatternDynamatic;

public interface AbstractPermission {
    public void modifyUserInfo();
    public void viewNote();
    public void publishNote();
    public void setLevel(int level);
}
