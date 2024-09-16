import java.util.Scanner;

public class index {
    public static int indexof(String a, String b)
    {
        for (int i = 0; i < a.length()-b.length(); i++) {
            if(a.substring(i, i+b.length()).equals(b))
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two string");
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(indexof(a, b));
        sc.close();
    }
}
