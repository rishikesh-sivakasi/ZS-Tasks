package array_1;

public class maxtriple {
    public int maxTriple(int[] nums) {
        return nums[0]>nums[nums.length/2] && nums[0]>nums[nums.length-1] ? nums[0] : nums[nums.length/2]>nums[nums.length-1] ? nums[nums.length/2] : nums[nums.length-1];
      }      
}
