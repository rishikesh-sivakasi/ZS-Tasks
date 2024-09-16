package recursion_1;

public class strdist {
    public int strDist(String str, String sub) {
        if (starts(str, sub) && ends(str, sub))
          return str.length();
        int fi = first(str, sub);
        if (fi == -1) 
          return 0;         
        int li = last(str, sub);
        if (li == -1) 
          return 0;
        return strDist(str.substring(fi, li + sub.length()), sub);
      }
      public boolean starts(String s, String ss) {
        return s.length() >= ss.length() && s.substring(0, ss.length()).equals(ss);
      }
      public boolean ends(String s, String ss) {
        return s.length() >= ss.length() && s.substring(s.length() - ss.length()).equals(ss);
      }
      public int first(String s, String ss) {
        for (int i = 0; i <= s.length() - ss.length(); i++) {
          if (s.substring(i, i + ss.length()).equals(ss))
            return i;
          }
        return -1;
      }
      public int last(String s, String ss) {
        for (int i = s.length() - ss.length(); i >= 0; i--) {
          if (s.substring(i, i + ss.length()).equals(ss)) 
            return i;
          }
        return -1;
      }
}
