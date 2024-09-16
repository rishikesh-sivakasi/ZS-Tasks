public class pattern6 {
    public static void main(String[] args) {
        String s = "1234567";
        int start = 0 , end = s.length()-1;
        for (int i = 0; i < s.length(); i++,start++,end--) {
            for (int j = 0; j < s.length(); j++) {
                if (j==start)
                    System.out.print(s.charAt(start));
                else if (j==end)
                    System.out.print(s.charAt(end));
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
