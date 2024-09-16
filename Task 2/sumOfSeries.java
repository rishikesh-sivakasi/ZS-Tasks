public class sumOfSeries {
    public static void main(String[] args) {
        int n = 7;
        int o = 0;
        String p = new String();
        int r = 0;
        for (int i = 1; i <= n; i++) {
            o = o*10 + 1;
            p = i!=n ? p+o+""+"+" :  p+o+"";
            r = r + o;
        }
        System.out.println(p);
        System.out.println("The sum is : "+r);
    }
}
