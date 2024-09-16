public class pattern7 {
    public static void star(int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
    public static void print(int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.print("_");
        }
    }
    public static void main(String[] args) {
        int n=4;
        int s = n;
        int t = 0;
        int x = (n*2)-1;
        for (int i = 0; i < x; i++) {
            star(s);
            print(t);
            print(t);
            star(s);
            s = i >= x/2 ? s+1 : s-1;
            t = i >= x/2 ? t-1 : t+1;
            System.out.println();
        }
    }
}
