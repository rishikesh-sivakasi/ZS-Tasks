package string_1;

public class lastwo {
    public String lastTwo(String str) {
        char a[] = str.toCharArray();
        if(str.length()>=2)
        {
          char t = a[a.length-2];
          a[a.length-2] = a[a.length-1];
          a[a.length-1] = t;
          return new String(a);
        }
        return str;    
    }      
}
