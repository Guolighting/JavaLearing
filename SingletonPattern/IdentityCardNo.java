package com.mode.SingletonPattern;

public class IdentityCardNo
{
    protected static IdentityCardNo instance=null;
    private String no;

    private IdentityCardNo()
    {
    }

    public static IdentityCardNo getInstance()
    {
        if(instance==null)
        {
            System.out.println("第一次办理身份证，分配新号码！");
            instance=new IdentityCardNo();
            instance.setIdentityCardNo("12345678");
        }
        else
        {
            System.out.println("重复办理身份证，获取旧号码！");
        }
        return instance;
    }

    private void setIdentityCardNo(String no)
    {
        this.no=no;
    }

    public String getIdentityCardNo()
    {
        return this.no;
    }

}