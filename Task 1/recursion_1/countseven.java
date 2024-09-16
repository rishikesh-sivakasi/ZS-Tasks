package recursion_1;

public class countseven {
    public int count7(int n) {
        if(n==0)
          return 0;
        else
        {
          int t = n%10;
          if(t==7)
            return 1 + count7(n/10);
          return count7(n/10);
        }
      }      
}
