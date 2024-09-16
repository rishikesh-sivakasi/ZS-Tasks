public class max10to20 {
    public int max1020(int a, int b) {
        if(((a>=10)&&(a<=20)) && ((b>=10)&&(b<=20)))
          return a>b ? a : b ;
        else if(((a>=10)&&(a<=20)) && !((b>=10)&&(b<=20)))
          return a;
        else if(((b>=10)&&(b<=20)) && !((a>=10)&&(a<=20)))
          return b;
        else
          return 0;
        
      }      
}
