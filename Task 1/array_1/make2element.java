package array_1;

public class make2element {
    public int[] make2(int[] a, int[] b) {
        int t[] = new int[2];
        if(a.length>=2)
        {
          t[0] = a[0];
          t[1] = a[1];
        }
        if(a.length==1 && b.length>=1)
        {
          t[0] = a[0];
          t[1] = b[0];
        }
        if(a.length==0 && b.length>=2)
        {
          t[0] = b[0];
          t[1] = b[1];
        }
        return t;
    }      
}
