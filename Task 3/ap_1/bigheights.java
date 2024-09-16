package ap_1;

public class bigheights {
    public int bigHeights(int[] heights, int start, int end) {
        int c = 0;
        for(;start<end;start++)
        {
          if(Math.abs(heights[start]-heights[start+1])>=5)
            c++;
        }
        return c;
      }      
}
