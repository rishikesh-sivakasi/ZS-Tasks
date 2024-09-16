package string_1;

public class rigth2char {
    public String right2(String str) {
        if(str.length()<=2)
          return str;
        return str.substring(str.length()-2) + str.substring(0,str.length()-2);
      }      
}
