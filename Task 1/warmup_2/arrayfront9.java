package warmup_2;

public class arrayfront9 {
    public boolean arrayFront9(int[] nums) {
        boolean f = false;
        for(int i=0;i<nums.length;i++)
        {
          if(nums[i] == 9)
            f = true;
          if(i>=3)
            break;
        }
        return f;
      }      
}
