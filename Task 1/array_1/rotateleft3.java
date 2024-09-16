package array_1;

public class rotateleft3 {
    public int[] rotateLeft3(int[] nums) {
        int t = nums[0];
        nums[0] = nums[1];
        nums[1] = t;
        t = nums[1];
        nums[1] = nums[2];
        nums[2] = t;
        return nums;
      }      
}
