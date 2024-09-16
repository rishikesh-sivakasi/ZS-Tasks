public class pattern4 {
    public static void main(String[] args) {
        int n = 9;
        int t = n;
        for(int i=n ; i>=1; i--)
        {
            for (int j = 0; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(t+" ");
            }
            t--;
            System.out.println();
        }
    }
}
