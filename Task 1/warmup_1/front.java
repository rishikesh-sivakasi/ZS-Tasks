public class front {
    public String front22(String str) {
        String t = new String();
        for(int i=0;i<str.length();i++)
        {
          t = t + str.charAt(i);
          if(t.length()==2)
            break;
        }
        t = t + str + t ;
        return t;
      }      
}
