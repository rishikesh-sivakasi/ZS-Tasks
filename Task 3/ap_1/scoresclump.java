package ap_1;

public class scoresclump {
    public boolean scoresClump(int[] scores) {
        if(scores.length<3)
          return false;
        for(int i=0;i<scores.length-2;i++)
        {
          if(Math.abs(scores[i]-scores[i+1])+Math.abs(scores[i+1]-scores[i+2])<=2)
            return true;
        }
        return false;
      }      
}
