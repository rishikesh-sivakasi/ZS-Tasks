package logic_2;

public class noteensum {
    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a)+fixTeen(b)+fixTeen(c);
      }
      public int fixTeen(int n){
        if(n==15 || n==16)
          return n;
        return n>=13 && n<=19 ? 0 : n;
      }      
}
