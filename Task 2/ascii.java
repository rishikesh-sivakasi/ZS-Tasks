import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character:");
        char a = sc.next().charAt(0);
        int t = a;
        System.out.println("the ascii value of "+a+" is "+t);
        sc.close();
    }
}
