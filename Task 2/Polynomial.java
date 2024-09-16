import java.util.Scanner;

public class Polynomial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coefficients a, b, c of the quadratic equation (ax^2 + bx + c = 0):");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double d = b * b - 4 * a * c;

        if (d < 0) {
            System.out.println("No real solutions found");
        } else {
            double sqrtD = Math.sqrt(d);
            double s1 = (-b + sqrtD) / (2 * a);
            double s2 = (-b - sqrtD) / (2 * a);
            System.out.printf("The solutions are: %.4f and %.4f%n", s1, s2);
        }

        sc.close();
    }
}
