package string_2;

public class plusout {
    public String plusOut(String str, String word) {
        char a[] = str.toCharArray();
        for(int i=0;i<a.length;i++)
        {
          if(i+(word.length()-1)<=a.length-1 && str.substring(i,i+word.length()).equals(word))
          {
            i = i + word.length()-1;
          }
          else
            a[i] = '+';
        }
        return new String(a);
      }      
}
