package com.mode.Mediator;

public class Client {
    public static void main(String args[]){
        AbstractChatroom happychat=new ChatGroup();
        Member member1,member2,member3,member4,member5;
        member1=new DiamondMember("张三");
        member2=new DiamondMember("李四");
        member3=new CommonMember("王五");
        member4=new CommonMember("周六");
        member5=new DiamondMember("小七");
        happychat.register(member1);
        happychat.register(member2);
        happychat.register(member3);
        happychat.register(member4);
        happychat.register(member5);
        member1.sendText("李四","李四，你好!");
        member2.sendText("李四","张三，你好!");
        member1.sendText("张三","今天天气不错,有日！");
        member1.sendImage("张三","有大太阳");
        member2.sendText("张三","太阳");
        member3.sendText("周六","还有问题？");
        member3.sendText("小七","还有问题？");
        member4.sendText("王五","没有问题了，谢谢");
        member5.sendText("王五","我也没有了！");
        member5.sendImage("王五","谢谢");
    }
}
