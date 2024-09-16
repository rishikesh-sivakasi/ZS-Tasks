import java.util.Scanner;

public class alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the char : ");
        char a = sc.next().charAt(0);
        if((a>=65 && a<=90) || (a>=97 && a<=122))
            System.out.println("the give character is an alphabet");
        else    
            System.out.println("the give character is not an alphabet");
        sc.close();
    }
}
