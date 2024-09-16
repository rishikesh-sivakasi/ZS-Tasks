import java.util.Arrays;

public class copyOfArray {
    public static void main(String[] args) {
        int a[] = {9,2,3,4,5,7};
        int b[] = new int[a.length];
        //b = Arrays.copyOfRange(a,0,a.length);
        for(int i=0;i<a.length;i++)
            b[i] = a[i];
        System.out.println("The first array is "+Arrays.toString(a));
        System.out.println("The second array is "+Arrays.toString(b));
    }
}
