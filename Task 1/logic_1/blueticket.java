package logic_1;

public class blueticket {
    public int blueTicket(int a, int b, int c) {
        if(a+b==10 || a+c==10 || b+c==10)
          return 10;
        else if((a+b) - (b+c) ==10 || (a+b) - (a+c) ==10 )
          return 5;
        return 0;
      }      
}
