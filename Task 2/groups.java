public class groups {
    public static void main(String[] args) {
        int r = 101 , s = 20 , gc = 4;
        int group[][] = new int[gc][s/gc]; 
        for(int i = 0;i<s;i++)
        {
            group[i%gc][i/gc] = r+i;
        }
        for (int i = 0; i < group.length; i++) {
            System.out.println("Group "+ (i+1));
            for (int j = 0; j < group[i].length; j++) {
                System.out.println(group[i][j]);
            }
        }
    }
}
