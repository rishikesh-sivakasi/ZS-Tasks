package array_2;

public class more1 {
    public boolean more14(int[] nums) {
        int one = 0 , four = 0 ;
        for(int i=0;i<nums.length;i++)
        {
          if(nums[i]==1)
            one++;
          else if(nums[i]==4)
            four++;
        }
        return one>four;
      }      
}
