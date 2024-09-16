package logic_1;

public class greenticket {
    public int greenTicket(int a, int b, int c) {
        if(a==b && b==c)
          return 20;
        else if((a==b && b!=c) || (a==c && b!=a) || (b==c && a!=b))
          return 10;
        return 0;
      }      
}
