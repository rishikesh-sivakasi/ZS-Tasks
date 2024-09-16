package logic_1;

public class answercell {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(isAsleep)
          return false;
        if( isMom || (!isMorning && !isMom && !isAsleep))
          return true;
        return false;
      }      
}
