package ap_1;

public class scoresaverage {
    public int scoresAverage(int[] scores) {
        int l = 0 , r = 0;
        l = average(scores,0,scores.length/2);
        r = average(scores,scores.length/2,scores.length);
        return l>r ? l : r;
      }
      public int average(int[] n , int s , int e)
      {
        int t = 0 ;
        int a = s==0 ? e : e/2;
        for(;s<e;s++)
        {
          t+=n[s];
        }
        return t/a;
      }      
}
