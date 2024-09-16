package recursion_1;

public class counteight {
    public int count8(int n) {
        if(n==0)
          return 0;
        else
        {
          int t = n%10;
          int tt = (n/10)%10;
          if(t==8)
          {
            if(tt==8)
              return 2 + count8(n/10);
            else
              return 1 + count8(n/10);
          }
          return count8(n/10); 
        }
      }      
}
