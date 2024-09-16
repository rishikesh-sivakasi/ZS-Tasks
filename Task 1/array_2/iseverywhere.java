package array_2;

public class iseverywhere {
    public boolean isEverywhere(int[] nums, int val) {
        int e = 0 , o = 0;
        if(nums.length>=2)
        {
          if(nums[0]==val) 
            e = 1 ;
          if(nums[1]==val)
            o = 1 ;
          if(e==0 && o==0)
            return false;
        }
        for(int i=1;i<nums.length;i++)
        {
          if(e==1 && i%2==0 && nums[i]!=val)
            return false;
          if(o==1 && i%2==1 && nums[i]!=val)
            return false;
        }
        return true;
      }   
}