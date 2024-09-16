package logic_2;

public class makechocolate {
    public int makeChocolate(int small, int big, int goal) {
        int r = 0;
        if(goal/5<=big)
        {
          r = goal-((goal/5)*5);
          return r<=small ? r : -1;
        }
        return goal-(big*5)<=small ? goal-(big*5): -1;
      }      
}
