package warmup_2;

public class has271check {
    public boolean has271(int[] nums) {
        for(int i=0;i<nums.length-2;i++)
        {
          int t = nums[i];
          if(nums[i+1]==(t+5) && Math.abs(nums[i+2]-(t-1))<=2)
            return true;
        }
        return false;
      }      
}
