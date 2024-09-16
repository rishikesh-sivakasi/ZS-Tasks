package string_2;

public class onetwo {
    public String oneTwo(String str) {
        int l = str.length();
        str = str.substring(0,l-(l%3));
        char a[] = str.toCharArray();
        char t = 'a';
        for(int i=0;i<a.length-2;i=i+3)
        {
          t = a[i];
          a[i] = a[i+1];
          a[i+1] = t;
          t = a[i+1];
          a[i+1] = a[i+2];
          a[i+2] = t;
        }
        return new String(a);
      }      
}
