package ap_1;

public class copyendy {
    public int[] copyEndy(int[] nums, int count) {
        int a[] = new int[count];
        int i=0;
        for(int t : nums)
        {
          if((t>=0 && t<=10) || (t>=90 && t<=100))
            a[i++] = t;
          if(i==count)
            break;
        }
        return a;
      }      
}
