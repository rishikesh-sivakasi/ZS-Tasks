package array_1;

public class reverse3element {
    public int[] reverse3(int[] nums) {
        int a[] = new int[nums.length];
        a[0] = nums[2];
        a[1] = nums[1];
        a[2] = nums[0];
        return a;
      }      
}
