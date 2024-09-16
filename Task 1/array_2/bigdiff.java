package array_2;

public class bigdiff {
    public int bigDiff(int[] nums) {
        int l = 0 , s = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
          s = Math.min(s,nums[i]);
          l = Math.max(l,nums[i]);
        }
        return l-s;
      }      
}
