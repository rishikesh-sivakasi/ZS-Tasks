package array_2;

public class zeromax {
    public int[] zeroMax(int[] nums) {
        int t = 0;
        for(int i=nums.length-1;i>=0;i--)
        {
          if(nums[i]%2==1)
            t = t < nums[i] ? nums[i] : t;
          else if(nums[i]==0)
            nums[i] = t ;
        }
        return nums;
      }       
}
