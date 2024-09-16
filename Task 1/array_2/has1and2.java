package array_2;

public class has1and2 {
    public boolean has12(int[] nums) {
        int o = 0,t = 0;
        for(int i=0;i<nums.length;i++)
        {
          if(nums[i]==1)
            o=1;
          if(o==1 && nums[i]==2)
            t=1;
        }
        return o==1 && t==1;
      }      
}
