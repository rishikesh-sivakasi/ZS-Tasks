package array_2;

public class fizzarray3 {
    public int[] fizzArray3(int start, int end) {
        int a[] = new int[end-start];
        for(int i=0;start<end;i++,start++)
        {
          a[i] = start;
        }
        return a;
      }      
}
