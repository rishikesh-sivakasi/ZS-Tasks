import java.util.Scanner;

public class printNinNtimes {

    public static void print(char a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        char a = ' ';
        int t = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetter(c)) {
                a = c;
            } else if (Character.isDigit(c)) {
                t = (t * 10) + (c - '0'); 
                if (i + 1 < s.length() && !Character.isDigit(s.charAt(i + 1))) {
                    print(a, t);
                    a = ' ';
                    t = 0;
                } else if (i + 1 >= s.length()) {
                    print(a, t);
                }
            }
        }
        sc.close();
    }
}
