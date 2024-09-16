package warmup_2;

public class yak {
    public String stringYak(String str) {
        String t = "";
        for (int i=0; i<str.length(); i++) {
          if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
            i =  i + 2;
          } else { 
            t = t + str.charAt(i);
          }
        }
        
        return t;
      }      
}
