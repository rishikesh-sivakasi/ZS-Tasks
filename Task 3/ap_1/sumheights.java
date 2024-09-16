package ap_1;

public class sumheights {
    public int sumHeights(int[] heights, int start, int end) {
        int c = 0;
        for(;start<end;start++)
        {
          c += Math.abs(heights[start]-heights[start+1]);
        }
        return c;
      }      
}
