package array_2;

public class tenrun {
    public int[] tenRun(int[] nums) {
        int t = -1;
        for(int i=0;i<nums.length;i++)
        {
          if(nums[i]%10==0)
            t = nums[i];
          if(t!=-1)
            nums[i] = t;
        }
        return nums;
      }      
}
