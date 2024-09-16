package string_1;

public class twochar {
    public String twoChar(String str, int index) {
        return index<=str.length()-2 && index>0?str.substring(index,index+2):str.substring(0,2);
      }      
}
