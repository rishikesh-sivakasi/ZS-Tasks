package logic_2;

public class closefar {
    public boolean closeFar(int a, int b, int c) {
        if(Math.abs(a-b)==1)
          return a>b ? Math.abs(a-c)>2 : Math.abs(b-c)>2;
        else if(Math.abs(a-c)==1)
          return a>c ? Math.abs(b-a)>2 : Math.abs(c-b)>2;
        else if(Math.abs(c-b)==1)
          return c>b ? Math.abs(c-a)>2 : Math.abs(a-b)>2;
        return a==b || b==c ;
      }      
}
