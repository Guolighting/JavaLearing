package Adaptor;
public class binary_insert extends binary_search implements insert{
    int a[]=new int[105];
    int v;
    int len;
    public void setinsert(int[] a, int v,int len) {
        this.a=a;
        this.v=v;
        this.len=len;
        int d[]=super.search(a,v,len);
        if(d.length==1){
            if(d[0]>=0){
                for(int i=len-1;i>=d[0];i--){
                    a[i+1]=a[i];
                }
                a[d[0]]=v;
            }
            if(d[0]==-1){
                for(int i=len-1;i>0;i--){
                    a[i+1]=a[i];
                }
                a[0]=v;
            }
            if(d[0]==-2) {
                a[len+1] = v;
            }
        }
        else {
            for(int i=len-1;i>=d[1];i--){
                a[i+1]=a[i];
            }
            if(d[1]==d[0]){
                a[d[1]+1]=v;
            }
            else a[d[1]]=v;
        }
    }
    public void print(){
        for(int i=0;i<len+1;i++){
            System.out.print(a[i]+" ");
        }
    }
}
