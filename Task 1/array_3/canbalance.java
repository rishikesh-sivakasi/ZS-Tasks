package array_3;

public class canbalance {
    public boolean canBalance(int[] nums) {
        int t = 0 , l = 0 , tt = 0;
        for(int n : nums)
          tt += n;
        if(tt%2==0)
          t = tt/2;
        else
          return false;
        for(int  n : nums)
        {
          l += n;
          if(l==t)
            return true;
        }
        return false;
      }      
}
