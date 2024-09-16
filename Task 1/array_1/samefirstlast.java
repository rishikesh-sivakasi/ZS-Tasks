package array_1;

public class samefirstlast {
    public boolean sameFirstLast(int[] nums) {
        if(nums.length==0)
          return false;
        else if(nums.length==1)
          return true;
        return nums[0]==nums[nums.length-1];
      }      
}
