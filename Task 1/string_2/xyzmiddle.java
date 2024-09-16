package string_2;

public class xyzmiddle {
    public boolean xyzMiddle(String str) {
        int n = str.length();
        for (int i = 0; i <= n - 3; i++) 
        {
          if (str.substring(i, i + 3).equals("xyz")) {
            int leftLength = i;
            int rightLength = n - (i + 3);
            if (Math.abs(leftLength - rightLength) <= 1) 
            {
              return true;
            }
          }
        }
        return false;
      }
}
