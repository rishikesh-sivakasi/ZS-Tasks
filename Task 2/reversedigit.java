import java.util.Scanner;

public class reversedigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int a = sc.nextInt();
        int t = a , r = 0;
        while (t!=0) {
            int s = t%10;
            r = r*10 + s;
            t = t/10;
        }
        System.out.println("the reverse of the number "+a+" is "+r);
        sc.close();
    }
}
