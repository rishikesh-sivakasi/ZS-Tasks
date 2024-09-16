package logic_1;

public class sumlimit {
    public int sumLimit(int a, int b) {
        if(String.valueOf(a).length() < String.valueOf(a+b).length())
          return a;
        return a+b;
      }      
}
