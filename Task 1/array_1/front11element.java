package array_1;

public class front11element {
    public int[] front11(int[] a, int[] b) {
        int t[] = new int[2];
        if(a.length==0 && b.length==0)
          return new int[]{};
        if(a.length>=1 && b.length>=1)
        {
          t[0] = a[0];
          t[1] = b[0];
        }
        if(a.length>=1 && b.length==0)
          return new int[]{ a[0] };
        if(a.length==0 && b.length>=1)
          return new int[] {b[0]};
        return t;
      }      
}
