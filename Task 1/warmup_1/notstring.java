public class notstring {
    public String notString(String str) {
        String t[] = str.split(" ",2);
        if(t[0].equals("not"))
          return str;
        else
          return "not "+str;
      }      
}
