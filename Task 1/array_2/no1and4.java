package array_2;

public class no1and4 {
    public boolean no14(int[] nums) {
        int o = 0 , f = 0;
        for(int i=0;i<nums.length;i++)
        {
          if(nums[i]==1)
            o = 1;
          else if(nums[i]==4)
            f = 1;
        }
        return !(o != 0 && f!=0);
      }      
}
