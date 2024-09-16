package logic_1;

public class inorderequal {
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        return (a<b && b<c) || (equalOk && a<=b && b<=c);
      }      
}
