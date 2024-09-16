package logic_2;

public class blackjack {
    public int blackJack(int a, int b) {
        if(a==21 || b==21)
          return 21;
        else if((a<21 & b>21) )
          return a;
        else if(b<21 && a>21)
          return b;
        else if(a<21 && b<21)
          return a>b ? a : b;
        return 0;
      }      
}
