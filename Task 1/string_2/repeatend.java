package string_2;

public class repeatend {
    public String repeatEnd(String str, int n) {
        String r = new String();
        for(int i=0;i<n;i++)
        {
          r = r + str.substring(str.length()-n);
        }
        return r;
      }      
}
