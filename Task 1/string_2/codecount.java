package string_2;

public class codecount {
    public int countCode(String str) {
        int c = 0;
        for(int i=0; i+3 < str.length();i++)
        {
          if(str.charAt(i)=='c' && str.charAt(i+1)=='o' && str.charAt(i+3)=='e')
            c++;
        }
        return c;
      }      
}
