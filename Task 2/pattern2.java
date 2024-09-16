public class pattern2 {
    public static void space(int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
    }
    public static void print(int n , int s , int m)
    {
        boolean f = true;
        for (int i = 1; i <= n; i++) {
            System.out.print(s);
            if(f==true && s==m)
                f = false ;
            s = f ? s+1 : s-1; 
        }
    }
    public static void main(String[] args) {
        int n = 9 , t = -1;
        for (int i = 1; i <= n; i++) {
            t = t+2;
            space(n-i);
            print(t,n-(i-1),n);
            System.out.println();
        }
    }
}

