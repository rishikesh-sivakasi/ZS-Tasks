package recursion_1;

public class changexy {
    public String changeXY(String str) {
        if(str.length()==0)
          return "";
        if(str.charAt(0)=='x')
          return 'y' + changeXY(str.substring(1));
        return str.charAt(0) + changeXY(str.substring(1));
      }      
}
