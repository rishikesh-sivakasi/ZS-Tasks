package string_2;

public class repeatfront {
    public String repeatFront(String str, int n) {
        String r = new String();
        for(int i=n;i>0;i--)
        {
          r = r + str.substring(0,i);
        }
        return r;
      }      
}
