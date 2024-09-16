package array_3;

public class squareup {
    public int[] squareUp(int n) {
        int[] result = new int[n * n];
        for (int i = 0; i < n; i++) {
          for (int j = 0; j <= i; j++) {
            result[(i * n) + (n - 1 - j)] = j + 1;
          }
        }
        return result;
      }      
}
