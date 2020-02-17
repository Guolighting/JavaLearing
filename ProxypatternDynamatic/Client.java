package ProxypatternDynamatic;

public class Client {
    public static void main(String[] args) {
        AbstractPermission permission;
        permission=new PermissionProxy();
        permission.viewNote();
        permission.publishNote();
        permission.modifyUserInfo();
        permission.setLevel(1);
        permission.viewNote();
        permission.publishNote();
        permission.modifyUserInfo();
    }
}
