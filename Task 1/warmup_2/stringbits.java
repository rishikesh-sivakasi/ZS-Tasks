package warmup_2;

public class stringbits {
    public String stringBits(String str) {
        String t = new String();
        for(int i=0;i<str.length();i=i+2)
        {
          t = t + str.charAt(i);
        }
        return t;
      }      
}
