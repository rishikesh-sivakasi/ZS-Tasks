package logic_2;

public class evenlyspaced {
    public boolean evenlySpaced(int a, int b, int c) {
        if(a==b && b==c)
          return true;
        int s = a<b && a<c ? a : b<c ? b : c ;
        int l = a>b && a>c ? a : b>c ? b : c ;
        int m = s!=a && l!=a ? a : s!=b && l!=b ? b : s!=c && l!=c ? c : 0;
        return l-m == m-s;
      }      
}
