package ap_1;

public class scoreup {
    public int scoreUp(String[] key, String[] answers) {
        int c = 0;
        for(int i=0;i<key.length;i++)
        {
          if(answers[i].equals("?"))
            continue;
          else if(key[i].equals(answers[i]))
            c = c + 4;
          else
            c = c - 1;
        }
        return c;
      }      
}
