package string_3;

public class maxblock {
    public int maxBlock(String str) {
        int l = 0 , ll = 1;
        if(str.length()==0)
          return l;
        for(int i=0;i<str.length()-1;i++)
        {
          for(int j=i+1;j<str.length();j++)
          {
            if(str.charAt(i)==str.charAt(j))
            {
              l = (j - i)+1;
              ll = ll<l ? l : ll;
            }
            else 
              break;
          }
        }
        return ll;
      }      
}
