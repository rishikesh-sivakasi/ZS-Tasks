package array_2;

public class centeredaverage {
    public int centeredAverage(int[] nums) {
        int l = 0 , s = Integer.MAX_VALUE , r = 0;
        for(int i=0;i<nums.length;i++)
        {
          s = Math.min(s,nums[i]);
          l = Math.max(l,nums[i]);
          r += nums[i];
        }
        return (r - (l+s) )/ (nums.length-2 );
      }      
}
