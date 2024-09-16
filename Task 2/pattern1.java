public class pattern1 {
    public static void space(int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
    }
    public static void print(int n)
    {
        int t = 0;
        boolean f = false;
        for (int i = 1; i <= n; i++) {
            t = f ? t-1 : t+1;
            System.out.print(t);
            f = i>=(n/2)+1;
        }
    }
    public static void main(String[] args) {
        int n = 9 , t = -1;
        for (int i = 1; i <= n; i++) {
            t = t+2;
            space(n-i);
            print(t);
            System.out.println();
        }
    }
}
