package array_2;

public class zerofront {
    public int[] zeroFront(int[] nums) {
        for(int i=0,t=0;i<nums.length;i++)
        {
          if(nums[i]==0)
          {
            nums[i] = nums[t];
            nums[t] = 0;
            t++;
          }
        }
        return nums;
      }      
}
