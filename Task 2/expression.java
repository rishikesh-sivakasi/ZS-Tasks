public class expression {
    public static void main(String[] args) {
        int a = 5, b = 7;
        System.out.println("++a-b-- = " + (++a-b--));
        System.out.println(a + " " + b);
        System.out.println("a%b++ = " + (a%b++));
        System.out.println(a + " " + b);
        a *= b+5 ;
        System.out.println("a *= b + 5 = " + (a));
        int x = 69>>>2 ;
        System.out.println("69>>>2 = " + (x));
    }
}
