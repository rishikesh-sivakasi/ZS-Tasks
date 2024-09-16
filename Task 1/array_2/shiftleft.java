package array_2;

public class shiftleft {
    public int[] shiftLeft(int[] nums) {
        for(int i=1;i<nums.length;i++)
        {
          int t = nums[i-1];
          nums[i-1] = nums[i];
          nums[i] = t;
        }
        return nums;
      }      
}
