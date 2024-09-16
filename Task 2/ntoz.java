import java.util.Scanner;

public class ntoz 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the capital letter :");
        char a = sc.next().charAt(0);
        for(int i = a;i<='Z';i++)
        {
            System.out.print((char)i + " ");
        }
        sc.close();
    }    
}