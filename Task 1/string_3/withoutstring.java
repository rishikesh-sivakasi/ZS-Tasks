package string_3;

public class withoutstring {
    public String withoutString(String base, String remove) {
        String r = new String();
        for(int i=0;i<base.length();i++)
        {
          if(i+remove.length() <= base.length() && base.substring(i,i+remove.length()).equalsIgnoreCase(remove))
            i = i + remove.length()-1;
          else
            r = r + base.charAt(i);
        }
        return r;
      }      
}
