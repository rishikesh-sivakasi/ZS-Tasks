package string_1;

public class defront {
    public String deFront(String str) {  
        String result = "";
        if(str.length()==1)
          return str.charAt(0)=='a' ? str : "" ;
        if(str.length()==2)
        {
           if(str.charAt(0)=='a')
            result = result + "a";
          if(str.charAt(1)=='b')
            result = result + "b";
        }
        if(str.length()>2)
        {
          if(str.charAt(0)=='a')
            result = result + "a";
          if(str.charAt(1)=='b')
            result = result + "b";
        }
        return result + str.substring(2);
      }      
}
