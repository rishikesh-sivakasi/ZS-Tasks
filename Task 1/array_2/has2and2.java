package array_2;

public class has2and2 {
    public boolean has22(int[] nums) {
        if(nums.length<=1)
          return false;
        for(int i=1;i<nums.length;i++)
        {
          if(nums[i]==2 && nums[i-1]==2)
            return true;
        }
        return false;
      }      
}
