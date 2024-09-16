package string_2;

public class zipzap {
    public String zipZap(String str) {
        String a = new String();
        if(str.length()<=2)
          return str;
        for(int i=0;i<str.length();i++)
        {
          if(i+2 <=str.length()-1 && str.charAt(i)=='z' && str.charAt(i+2)=='p')
          {
            a = a + "zp";
            i = i + 2;
          }
          else
            a = a + str.charAt(i);
        }
        return a;
      }      
}
