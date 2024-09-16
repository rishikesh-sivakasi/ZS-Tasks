package string_1;

public class withoutend {
    public String withoutEnd(String str) {
        if(str.length()<=2)
          return "";
        return str.substring(1,str.length()-1);
      }      
}
