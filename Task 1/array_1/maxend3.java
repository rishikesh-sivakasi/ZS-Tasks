package array_1;

public class maxend3 {
    public int[] maxEnd3(int[] nums) {
        return nums[0]>nums[nums.length-1] ? new int[]{nums[0],nums[0],nums[0]} :new int[]{nums[nums.length-1],nums[nums.length-1],nums[nums.length-1]};
      }      
}
