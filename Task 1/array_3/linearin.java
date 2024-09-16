package array_3;

public class linearin {
    public boolean linearIn(int[] outer, int[] inner) {
        int t = 0;
        if(inner.length==0)
          return true;
        for(int i=0;i<outer.length;i++)
        {
          if(outer[i]==inner[t])
            t++;
          if(t==inner.length)
            break;
        }
        return t==inner.length;
      }      
}
