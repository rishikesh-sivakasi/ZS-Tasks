package array_2;

public class withouten {
    public int[] withoutTen(int[] nums) {
        int [] a = new int[nums.length];
        int f = 0,l = nums.length-1 ;
        for(int i=0;i<nums.length;i++)
        {
          if(nums[i]==10)
            a[l--] = 0;
          else
            a[f++] = nums[i];
        }
        return a;
      }      
}
