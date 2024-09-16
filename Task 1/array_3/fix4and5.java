package array_3;

public class fix4and5 {
    public int[] fix45(int[] nums) {
        int r [] = new int[nums.length];
        int f [] = new int[nums.length];
        int fi = 0;
        for(int i=0;i<nums.length;i++)
        {
          if(nums[i]==4)
          {
            r[i] = 4;
            r[i+1] = 5;
            i++;
          }
          else
            f[fi++] = i;
        }
        fi = 0;
        for(int i=0;i<nums.length;i++)
        {
          if(nums[i]!=4 && nums[i]!=5)
            r[f[fi++]] = nums[i];
        }
        return r;
      }      
}
