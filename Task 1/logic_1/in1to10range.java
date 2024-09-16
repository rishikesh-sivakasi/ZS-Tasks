package logic_1;

public class in1to10range {
    public boolean in1To10(int n, boolean outsideMode) {
        if((n>1 && n<10) && outsideMode)
          return false;
        if(n>=1 && n<=10 || outsideMode)
          return true;
        return false;
      }      
}
