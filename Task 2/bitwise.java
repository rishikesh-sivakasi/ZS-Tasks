import java.util.Scanner;

public class bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value a :");
        int a = sc.nextInt();
        System.out.println("Enter the value b :");
        int b = sc.nextInt();
        System.out.println("a & b = "+(a&b));
        System.out.println("a | b = "+(a|b));
        System.out.println("a ^ b = "+(a^b));
        System.out.println("~a = "+ ~a);
        System.out.println("a<<1 = "+ (a<<1));
        System.out.println("a>>1 = "+ (a>>1));
        sc.close();
    }
}
