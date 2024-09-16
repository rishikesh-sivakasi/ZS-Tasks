package warmup_2;

public class array667pattern {
    public int array667(int[] nums) {
        int a=0,b=1,c=0;
        if(nums.length<2)
          return 0;
        for(;b<nums.length;a++,b++)
        {
          if(nums[a]==6 && (nums[b]==6 || nums[b]==7))
            c++;
        }
        return c;
      }      
}
