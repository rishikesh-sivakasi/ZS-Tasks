package warmup_2;

public class doublex {
    boolean doubleX(String str) {
        return (str.length()>str.indexOf('x')+1) && str.charAt(str.indexOf('x')+1) == 'x';
      }      
}
