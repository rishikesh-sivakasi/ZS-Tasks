package string_3;

public class sumdigits {
    public int sumDigits(String str) {
        int c = 0;
        for(int i=0;i<str.length();i++)
        {
          if(Character.isDigit(str.charAt(i)))
            c += Integer.parseInt(str.charAt(i)+"");
        }
        return c;
      }      
}
