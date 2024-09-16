package array_1;

public class start1value {
    public int start1(int[] a, int[] b) {
        int c=0;
        if(a.length==0 && b.length==0)
          return c;
        if(a.length==0)
          return b[0]==1 ? c+1 : c;
        else if(b.length==0)
          return a[0]==1 ? c+1 : c;
        else if( a[0]==1 && b[0]==1 )
          c = c+2;
        else if( a[0]==1 && b[0]!=1 )
          c = c+1;
        else if( a[0]!=1 && b[0]==1 )
          c = c+1;
        return c;
      }      
}
