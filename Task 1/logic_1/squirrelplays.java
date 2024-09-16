package logic_1;

public class squirrelplays {
    public boolean squirrelPlay(int temp, boolean isSummer) {
        return temp>=60 && temp<=90 || (isSummer && temp>=90 && temp<=100);
      }      
}
