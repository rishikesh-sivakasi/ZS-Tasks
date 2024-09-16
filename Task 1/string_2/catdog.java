package string_2;

public class catdog {
    public boolean catDog(String str) {
        int c = 0 , d = 0;
        for(int i=0;i<str.length()-2;i++)
        {
          c = str.substring(i,i+3).equals("cat") ? c+1 : c ;
          d = str.substring(i,i+3).equals("dog") ? d+1 : d ;
        }
        return c==d;
      }      
}
