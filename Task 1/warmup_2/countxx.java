package warmup_2;

public class countxx {
    int countXX(String str) {
        String t = "xx";
        int c = 0; 
        for(int i=0,j=2;j<=str.length();i++,j++)
        {
          c = str.substring(i,j).equals(t) ? c+1 : c ;
        }
        return c;
      }      
}
