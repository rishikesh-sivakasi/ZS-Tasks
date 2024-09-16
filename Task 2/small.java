public class small {
    public static void main(String[] args) {
        int a[] = {9,2,6,3,1,5};
        int t = Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            t = t > a[i] ? a[i] : t;
        }
        System.out.println("The smallest element of the array is "+t);
    }
}
