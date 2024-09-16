package string_2;

public class getsandwitch {
    public String getSandwich(String str) 
    {
        int bc = 0;
        int f = -1;
        int l = -1;
        for (int i = 0; i <= str.length() - 5; i++) {
          if (str.substring(i, i + 5).equals("bread")) {
            if (bc == 0) {
              f = i;
            }
            l = i;
            bc++;
            i += 4;
            }
          }
          if (bc < 2 || f == -1 || l == -1 || f == l) {
            return "";
          }
          return str.substring(f + 5, l);
    }      
}
