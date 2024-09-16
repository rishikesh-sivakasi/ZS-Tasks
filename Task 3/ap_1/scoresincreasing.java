package ap_1;

public class scoresincreasing {
    public boolean scoresIncreasing(int[] scores) {
        if(scores.length<=1)
          return true;
        for(int i=1;i<scores.length;i++)
        {
          if(scores[i-1]>scores[i])
            return false;
        }
        return true;
      }      
}
