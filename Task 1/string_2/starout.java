package string_2;

public class starout {
    public String starOut(String str) {
        StringBuilder result = new StringBuilder();
        int l = str.length();
        for (int i = 0; i < l; i++) {
          if (str.charAt(i) == '*') {
            if (i > 0) 
              i++; 
            continue; 
          }
          if (i > 0 && str.charAt(i - 1) == '*') 
            continue;
          if(i+1<=l-1 && str.charAt(i+1) == '*')
            continue;
          result.append(str.charAt(i));
        }
        return result.toString();
      }      
}
