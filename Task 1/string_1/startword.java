package string_1;

public class startword {
    public String startWord(String str, String word) {
        String res = "";
        String t = word.substring(1);
        if(str.length()>=word.length())
        {
          if(str.substring(1,1+t.length()).equals(t))
            res = str.substring(0,word.length()) ;
        }
        return res;
    }      
}
