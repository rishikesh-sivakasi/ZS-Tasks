package string_2;

public class doublechar {
    public String doubleChar(String str) {
        String a = new String();
        for(int i=0,x=0;i<str.length()*2;i++)
        {
          if(i!=0 && i%2==0)
            x++;
          a = a + str.charAt(x);
        }
        return a;
      }      
}
