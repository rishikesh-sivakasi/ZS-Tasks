import java.util.Arrays;

public class minandmax {
    public static void main(String[] args) {
        int a[] = {9,3,5,1,6,2,8,7,0};
        Arrays.sort(a);
        int b[] = new int[a.length];
        int i=0,j=a.length-1 , t=0;
        while (i<=j) {
            if(t%2==0)
                b[t++] = a[j--];
            else    
                b[t++] = a[i++];
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
