package ap_1;

public class divideself {
    public boolean dividesSelf(int n) {
        if (n == 0) return false;
        int original = n;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 0 || original % digit != 0) {
              return false;
            }
            n /= 10; 
          }
        return true;
      }      
}
