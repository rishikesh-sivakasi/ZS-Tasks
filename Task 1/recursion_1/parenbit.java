package recursion_1;

public class parenbit {
    public String parenBit(String str) {
        if(str.startsWith("(") && str.endsWith(")"))
          return str;
        int fi = str.indexOf('(');
        if(fi == -1)
          return "";
        int li = find(str,fi);
        if(li==-1)
          return "";
        return parenBit(str.substring(fi , li+1));
      }
    public int find(String s , int n)
    {
        int c = 1;
        for(int i=n+1 ; i<s.length();i++)
        {
          if(s.charAt(i)=='(')
            c++;
          else if(s.charAt(i)==')')
            c--;
          if(c==0)
            return i;
        }
        return -1;
      }      
}
