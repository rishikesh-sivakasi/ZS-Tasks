package array_2;

public class evenodd {
    public int[] evenOdd(int[] nums) {
        int e = 0,o = nums.length-1;
        while(e<o)
        {
          if(nums[e]%2==1 && nums[o]%2==0)
          {
            int t = nums[e];
            nums[e] = nums[o];
            nums[o] = t;
            e++;
            o--;
          }
          if(nums[e]%2==0)
            e++;
          if(nums[o]%2==1)
            o--;
        }
        return nums;
      }      
}
