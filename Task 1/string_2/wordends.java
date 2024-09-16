package string_2;

public class wordends {
    public String wordEnds(String str, String word) {
        String r = new String();
        for(int i=0;i<(str.length()-word.length())+1;i++)
        {
          if(str.substring(i,i+word.length()).equals(word))
          {
            if(i-1 >= 0 && i+word.length() <= str.length()-1)
              r = r + str.charAt(i-1) + str.charAt(i+word.length());
            else if(i-1<0 && i+word.length() <= str.length()-1)
              r = r + str.charAt(i+word.length());
            else if(i-1>=0 && i+word.length() > str.length()-1)
              r = r + str.charAt(i-1);
          }
        }
        return r;
      }      
}
