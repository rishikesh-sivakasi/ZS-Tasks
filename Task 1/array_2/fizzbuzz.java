package array_2;

public class fizzbuzz {
    public String[] fizzBuzz(int start, int end) {
        String a[] = new String[end-start];
        for(int i=0;start<end;start++,i++)
        {
          if(start%3==0 && start%5==0)
            a[i] = "FizzBuzz";
          else if(start%3==0)
            a[i] = "Fizz";
          else if(start%5==0)
            a[i] = "Buzz";
          else
            a[i] = String.valueOf(start);
        }
        return a;
      }      
}
