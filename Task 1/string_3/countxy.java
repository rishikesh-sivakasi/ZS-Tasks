package string_3;

public class countxy {
    public int countYZ(String str) {
        int c = 0;
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
          if((str.charAt(i)=='y' || str.charAt(i)=='z') && i+1 <=str.length()-1 && !Character.isLetter(str.charAt(i+1)))
            c++;
          if((str.charAt(i)=='y' || str.charAt(i)=='z') && i==str.length()-1)
            c++;
        }
        return c;
      }      
}
