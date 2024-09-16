package logic_2;

public class roundsum {
    public int roundSum(int a, int b, int c) {
        return round10(a)+round10(b)+round10(c);
      }
      public int round10(int num){
        return num%10>=5 ? ((num/10)+1)*10 : (num/10)*10 ;
      }      
}
