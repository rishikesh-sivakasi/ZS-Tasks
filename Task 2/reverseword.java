import java.util.Scanner;

public class reverseword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String s = sc.nextLine();
        String t = new String();
        for(int i=s.length()-1,j=s.length(); i>=0;i--)
        {
            if(Character.isWhitespace(s.charAt(i)))
            {
                t = t + s.substring(i+1, j) + " ";
                j = i;
            }
            else if(i==0)
                t = t + s.substring(i, j);
        }
        System.out.println(t);
        sc.close();
    }
}
