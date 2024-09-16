package array_1;

public class sumfirst2 {
    public int sum2(int[] nums) {
        if(nums.length==0)
          return 0;
        else if(nums.length==1)
          return nums[0];
        return nums[0]+nums[1];
      }      
}
