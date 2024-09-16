package array_3;

public class seriesup {
    public int[] seriesUp(int n) {
        int a[] = new int[(n*(n+1))/2];
        int t = n;
        for(int i=a.length-1 ; i>=0 ; i--)
        {
          if(t==0)
          {
            t = n - 1;
            n--;
          }
          a[i] = t;
          t--;
        }
        return a;
      }      
}
