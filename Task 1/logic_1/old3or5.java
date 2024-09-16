package logic_1;

public class old3or5 {
    public boolean old35(int n) {
        if(n%3==0 && n%5==0)
          return false;
        if(n%3==0 || n%5==0)
          return true;
        return false;
      }      
}
