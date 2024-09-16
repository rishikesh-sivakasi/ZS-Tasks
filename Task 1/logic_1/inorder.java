package logic_1;

public class inorder {
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if((bOk && c>b) || (b>a && c>b))
          return true;
        return false;
      }      
}
