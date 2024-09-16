package ap_1;

public class scorespecial {
    public int scoresSpecial(int[] a, int[] b) {
        int l = 0 , r = 0;
        for(int i=0;i<a.length;i++)
        {
          l = a[i]%10==0 && a[i]>l ? a[i] : l;
        }
        for(int i=0;i<b.length;i++)
        {
          r = b[i]%10==0 && b[i]>r ? b[i] : r;
        }
        return l+r;
      }      
}
