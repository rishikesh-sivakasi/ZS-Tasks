package string_2;

public class endother {
    public boolean endOther(String a, String b) {
        if(a.length()>b.length())
        {
          return a.substring(a.length()-b.length()).toLowerCase().equals(b.toLowerCase());
        }
        return b.substring(b.length()-a.length()).toLowerCase().equals(a.toLowerCase());
      }      
}
