package array_2;

public class samends {
    public boolean sameEnds(int[] nums, int len) {
        int l = nums.length-len;
        for(int i=0;l<nums.length;i++,l++)
        {
          if(nums[i]!=nums[l])
            return false;
        }
        return true;
      }      
}
