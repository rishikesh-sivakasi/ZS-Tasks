package array_3;

public class fix3and4 {
    public int[] fix34(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] freeIndices = new int[n];
        int freeCount = 0;
        for (int i = 0; i < n; i++) {
          if (nums[i] == 3) {
            result[i] = 3;
            result[i + 1] = 4;
            i++;
          }
          else
            freeIndices[freeCount++] = i;
        }
        int freeIndex = 0;
        for (int i = 0; i < n; i++) {
          if (nums[i] != 3 && nums[i] != 4) {
            result[freeIndices[freeIndex++]] = nums[i];
          }
        }
        return result;
      }      
}
