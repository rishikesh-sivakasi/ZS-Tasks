package warmup_2;

public class count9 {
    public int arrayCount9(int[] nums) {
        int c = 0;
        for(int i=0;i<nums.length;i++)
        {
          c = nums[i]==9 ? c+1 : c;
        }
        return c;
      }      
}
