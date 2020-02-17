package Adaptor;
public class binary_search {
    public int[] search(int[] a, int v,int len) {
        int l = 0;
        int h = len-1;
        int m;
        int ll=0,rr=0;
        int b[]=new int[3];
        int c[]=new int [1];
        int d[]=new int[1];
        int e[]=new int [1];
        d[0]=-1;
        e[0]=-2;
        if(v<a[l])return d;
        if(v>a[h]) return e;
        while (l <= h) {
            if(l<=h){
                ll=l;
                rr=h;
            }
            m = (l + h) / 2;
            if (a[m] == v) {
                c[0]=m+1;
                return c;
            } else if (a[m]>v) {
                h = m - 1;
            } else if (a[m] < v) {
                l = m + 1;
            }
        }
        b[0]=ll;
        b[1]=rr;
        return b;
    }
}
