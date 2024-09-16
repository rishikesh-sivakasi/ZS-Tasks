import java.util.Arrays;

public class merge2sarray {
    public static void main(String[] args) {
        int a[] = {2,2,3,5,7,7,9};
        int b[] = {1,3,4,4,6,8,8};
        int c[] = new int[a.length+b.length];
        int i=0,j=0,k=0;
        while (i<a.length || j<b.length) {
            if(i<a.length && j<b.length)
            {
                if (a[i]<b[j]) 
                {
                    if(k-1>=0 && c[k-1]==a[i])
                        i++;
                    else if(k-1>=0 && c[k-1]!=a[i])
                        c[k++] = a[i++];
                    else
                        c[k++] = a[i++];
                }
                else if(a[i]>b[j])
                {
                    if(k-1>=0 && c[k-1]==b[j])
                        j++;
                    else if(k-1>=0 && c[k-1]!=b[j])
                        c[k++] = b[j++];
                    else
                        c[k++] = b[j++];
                }
                else if (a[i]==b[j]) {
                    if(i+1<a.length)
                        i++;
                    else if(j+1<a.length)
                        j++;
                    else
                        c[k++] = a[i++];
                }
            }
            else if(i<a.length)
            {
                if(k-1>=0 && c[k-1]==a[i])
                    i++;
                else if(k-1>=0 && c[k-1]!=a[i])
                    c[k++] = a[i++];
                else
                    c[k++] = a[i++];
            }
            else
            {
                if(k-1>=0 && c[k-1]==b[j])
                    j++;
                else if(k-1>=0 && c[k-1]!=b[j])
                    c[k++] = b[j++];
                else
                    c[k++] = b[j++];
            }
        }
        c = Arrays.copyOfRange(c,0,k);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
    }
}
