package array_1;

public class firstlast6 {
    public boolean firstLast6(int[] nums) {
        if(nums.length>=2)
          return nums[0]==6 || nums[nums.length-1]==6 ; 
        return nums[0]==6;
      }      
}
