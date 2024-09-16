package array_1;

public class frontpeice {
    public int[] frontPiece(int[] nums) {
        if(nums.length<=2)
          return nums;
        return new int[]{nums[0],nums[1]};
      }      
}
