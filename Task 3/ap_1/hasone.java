package ap_1;

public class hasone {
    public boolean hasOne(int n) {
        while(n!=0)
        {
          if(n%10==1)
            return true;
          n = n/10;
        }
        return false;
      }      
}