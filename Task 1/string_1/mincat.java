package string_1;

public class mincat {
    public String minCat(String a, String b) {
        if(a.length()==0 || b.length()==0)
          return "";
        return a.length()>b.length() ? a.substring(a.length()-b.length())+b : a+b.substring(b.length()-a.length()) ;
      }      
}
