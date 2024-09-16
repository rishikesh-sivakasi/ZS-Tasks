package array_3;

public class maxspan {
    public int maxSpan(int[] nums) {
        int s = 0;
        for(int i=0;i<nums.length;i++)
        {
          for(int j=nums.length-1;j>=i;j--)
          {
            if(nums[i]==nums[j])
            {
              s = s<(j - i)+1 ? (j-i)+1 : s;
              break;
            }
          }
        }
        return s;
    }      
}
