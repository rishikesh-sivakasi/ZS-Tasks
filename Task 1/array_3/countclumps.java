package array_3;

public class countclumps {
    public int countClumps(int[] nums) {
        if (nums.length == 0)
          return 0;
        int count = 0;
        boolean inClump = false;
        for (int i = 0; i < nums.length - 1; i++) {
          if (nums[i] == nums[i + 1]) {
            if (!inClump) {
              count++;
              inClump = true;
            }
          } else
              inClump = false;
        }
        return count;  
      }      
}
