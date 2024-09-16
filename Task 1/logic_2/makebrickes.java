package logic_2;

public class makebrickes {
    public boolean makeBricks(int small, int big, int goal) {
        if(big * 5 == goal || small==goal || (big*5 - goal)%5==0 )
          return true;
        else if(goal-(big*5)>0 && goal-(big*5)<=small)
          return true;
        else if(goal-((big/2)*5)>0 && goal-((big/2)*5)<=small)
          return true;
        return false;
      }      
}
