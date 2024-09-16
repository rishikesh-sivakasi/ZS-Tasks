import java.util.Arrays;

public class odd {
    public static void main(String[] args) {
        int a [] = {3,1,2,5,4,7,6,9,8};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int i=0 , j = a.length%2==1 ? a.length-1 : a.length-2;
        while (i<j) {
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
            i=i+2;
            j=j-2;
        }
        System.out.println(Arrays.toString(a));
    }
}
