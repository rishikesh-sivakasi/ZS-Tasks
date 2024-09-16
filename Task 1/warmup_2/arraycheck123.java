package warmup_2;

public class arraycheck123 {
    public boolean array123(int[] nums) {
        int a = 0,b = 1,c = 2;
        if(nums.length>=3)
        {
          for(;c<nums.length;a++,b++,c++)
          {
            if(nums[a]==1 && nums[b]==2 && nums[c]==3)
              return true;
          }
        }
        return false;
      }      
}
