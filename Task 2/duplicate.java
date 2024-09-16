import java.util.*;

public class duplicate {
    public static void main(String[] args) {
        int a[] = {5,5,3,2,7,2,0,9,1};
        int b[] = new int[a.length];
        int j=0;
        // Set<Integer> t = new HashSet<Integer>();
        // for(int i=0;i<a.length;i++)
        // {
            //     if(t.add(a[i]))
            //         b[j++] = a[i];
            // }
        for (int i = 0; i < a.length; i++) 
        {
            boolean f = true;
            if (j==0) {
                b[j++] = a[i];
                continue;
            }
            for (int k = 0; k < j; k++) {
                if(b[k]==a[i])
                {
                    f = false;
                    break;
                }
            }
            if(f)
                b[j++] = a[i];
        }
        b = Arrays.copyOfRange(b,0,j);
        System.out.println(Arrays.toString(a)); 
        System.out.println(Arrays.toString(b)); 
    }
}
