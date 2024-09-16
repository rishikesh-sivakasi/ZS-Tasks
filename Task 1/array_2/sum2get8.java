package array_2;

public class sum2get8 {
    public boolean sum28(int[] nums) {
        int s = 0;
        for(int i=0;i<nums.length;i++)
        {
          if(nums[i]==2)
            s += 2;
        }
        return s==8;
      }      
}
