package array_2;

public class countevens {
    public int countEvens(int[] nums) {
        int c = 0;
        for(int i=0;i<nums.length;i++)
          c = nums[i]%2==0 ? c+1 : c ;
        return c;
      }      
}
