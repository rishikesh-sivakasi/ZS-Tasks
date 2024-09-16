package array_2;

public class havethree {
    public boolean haveThree(int[] nums) {
        int c = 0;
        for(int i=0;i<nums.length;i++)
        {
          if(nums[i]==3)
          {
            c++;
            i++;
          }
        }
        return c==3;
      }      
}
