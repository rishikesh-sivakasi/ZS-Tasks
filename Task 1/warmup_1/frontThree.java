public class frontThree {
    public String front3(String str) {
        String t = new String();
        if (str.length()>=3)
        {
          t = str.substring(0,3);
          return t+t+t;
        }
        return str+str+str;
      }      
}
