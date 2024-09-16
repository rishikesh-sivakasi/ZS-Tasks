package array_3;

public class maxmirror {
    public int maxMirror(int[] nums) {
        int n = nums.length;
        int[] reversedArray = reverse(nums);
        int maxMirrorLength = 0;
        for (int start1 = 0; start1 < n; start1++) {
          for (int start2 = 0; start2 < n; start2++) {
            int length = 0;
            while (start1 + length < n && start2 + length < n && nums[start1 + length] == reversedArray[start2 + length]) {
              length++;
            }
            maxMirrorLength = Math.max(maxMirrorLength, length);
          }
        }
        return maxMirrorLength;
      }
      private int[] reverse(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
          reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
      }
}
