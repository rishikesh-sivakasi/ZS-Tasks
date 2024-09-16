package ap_1;

public class sumheights2 {
    public int sumHeights2(int[] heights, int start, int end) {
        int c = 0;
        for(;start<end;start++)
        {
          if(heights[start]<heights[start+1])
            c += (heights[start+1] - heights[start]) * 2;
          else
            c += heights[start] - heights[start+1];
        }
        return c;
      }      
}
