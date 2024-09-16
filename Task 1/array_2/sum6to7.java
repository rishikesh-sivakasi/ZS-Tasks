package array_2;

public class sum6to7 {
    public int sum67(int[] nums) {
        int s = 0, f = 0 ;
        for(int i=0;i<nums.length;i++)
        {
          if(nums[i]==6)
            f = 1;
          else if(f==0)
            s += nums[i];
          else if(nums[i]==7)
            f = 0;
        }
        return s;
      }      
}
