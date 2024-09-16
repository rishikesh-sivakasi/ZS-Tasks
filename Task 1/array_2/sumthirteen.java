package array_2;

public class sumthirteen {
    public int sum13(int[] nums) {
        int s = 0;
        for(int i=0;i<nums.length;i++)
        {
          if(nums[i]==13 || (i-1>=0 && nums[i-1]==13))
            continue;
          s += nums[i];
        }
        return s;
      }      
}
