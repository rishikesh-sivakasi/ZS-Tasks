package ap_1;

public class copyevens {
    public int[] copyEvens(int[] nums, int count) {
        int a[] = new int[count];
        int i=0;
        for(int t : nums)
        {
          if(t%2==0)
            a[i++] = t;
          if(i==count)
            break;
        }
        return a;
      }      
}
