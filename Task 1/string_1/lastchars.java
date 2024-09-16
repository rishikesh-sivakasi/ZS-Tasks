package string_1;

public class lastchars {
    public String lastChars(String a, String b) {
        if(a.length()>=1 && b.length()>=1)
          return a.charAt(0)+""+b.charAt(b.length()-1);
        else if (a.length()==0 && b.length()>=1)
          return "@"+b.charAt(b.length()-1);
        else if (a.length()>=1 && b.length()==0)
          return a.charAt(0)+"@";
        return "@"+"@";
      }      
}
