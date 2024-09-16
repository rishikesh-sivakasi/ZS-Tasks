import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class matrixTraversal {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        List<List<Integer>> res = new ArrayList<>(); 
        int r = 0 , c = 0;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the value");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<(a.length*2)-1;i++)
        {
            List<Integer> t = new ArrayList<Integer>();
            r = i>=a.length ? r+1 : 0;
            c = i>=a.length ? a.length-1 : i;
            int x = r;
            while (x<a.length && c>=0) {
                t.add(a[x][c]);
                x++;
                c--;
            }
            res.add(new ArrayList<>(t));
            t.clear();
        }
        System.out.println(res);
        sc.close();
    }
}
