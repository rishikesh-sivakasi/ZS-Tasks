package array_2;

public class either2or4 {
    public boolean either24(int[] nums) {
        int t = 0, f = 0;
        for(int i=1;i<nums.length;i++)
        {
          if(nums[i-1]==2 && nums[i]==2)
            t=1;
          if(nums[i-1]==4 && nums[i]==4)
            f=1;
        }
        return t!=f;
      }      
}
