public class everynth {
    public String everyNth(String str, int n) {
        String a = new String();
        for(int i=0;i<str.length();i=i+n)
        {
          a = a + str.charAt(i);
        }
        return a;
      }      
}
