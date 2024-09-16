package logic_1;

public class cigarparty {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        return (cigars>=40 && cigars<=60) || (isWeekend && cigars>=40);
      }      
}
