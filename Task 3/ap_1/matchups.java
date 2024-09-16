package ap_1;

public class matchups {
    public int matchUp(String[] a, String[] b) {
        int c = 0;
        for(int i=0;i<a.length;i++)
        {
          if(a[i].length()!=0 && b[i].length()!=0)
            c = a[i].charAt(0)==b[i].charAt(0) ? c+1 : c;
        }
        return c;
      }      
}
