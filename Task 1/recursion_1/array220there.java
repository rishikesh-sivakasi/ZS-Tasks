package recursion_1;

public class array220there {
    public boolean array220(int[] nums, int index) {
        if(index==nums.length-1 || nums.length==0)
          return false;
        else
        {
          if(nums[index]*10 == nums[index+1])
            return true;
          else
            return array220(nums , index+1);
        }
      }      
}
