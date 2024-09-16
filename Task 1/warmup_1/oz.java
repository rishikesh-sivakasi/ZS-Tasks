public class oz {
    public String startOz(String str) {
        String t = new String();
        if (str.length() >= 1 && str.charAt(0)=='o')
          t = t + str.charAt(0);
        if (str.length() >= 2 && str.charAt(1)=='z')
          t = t + str.charAt(1);
        return t;
    }      
}
