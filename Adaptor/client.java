package Adaptor;

public class client {
    public static void main(String[] args) {
        int a[]=new int [105];
        int len=4;
        a[0]=5;
        a[1]=7;
        a[2]=8;
        a[3]=9;
        int v=6;//要插入的数
        insert ins=new binary_insert();
        ins.setinsert(a,v,len);
        ins.print();
    }
}
