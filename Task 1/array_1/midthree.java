package array_1;

public class midthree {
    public int[] midThree(int[] nums) {
        return new int[]{nums[(nums.length/2)-1],nums[(nums.length/2)],nums[(nums.length/2)+1]};
      }      
}
