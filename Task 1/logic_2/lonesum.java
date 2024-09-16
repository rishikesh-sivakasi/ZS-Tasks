package logic_2;

public class lonesum {
    public int loneSum(int a, int b, int c) {
        if(a==b && b==c)
          return 0;
        int t = a==b && b!=c ? c : b==c && a!=c ? a : a==c && a!=b ? b : 0;
        return t!=0 ? t : a+b+c;
      }      
}
