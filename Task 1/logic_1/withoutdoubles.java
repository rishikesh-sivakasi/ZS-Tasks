package logic_1;

public class withoutdoubles {
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if(noDoubles && die1==die2)
          return die1==6 ? 1+die2 : ++die1 + die2;
        return die1+die2;
      }      
}
