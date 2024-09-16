import java.util.Scanner;

public class floatvalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the decimal value:");
        float a = sc.nextFloat();
        System.out.printf("%.2f" , a);
        sc.close();
    }
}
