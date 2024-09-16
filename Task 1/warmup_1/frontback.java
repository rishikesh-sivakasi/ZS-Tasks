public class frontback {
    public String frontBack(String str) {
        if(str.length()>=2)
        {
          char t[] = str.toCharArray();
          char temp = t[0];
          t[0] = t[t.length-1];
          t[t.length-1] = temp;
          return new String(t);
        }
        return str;
      }      
}
