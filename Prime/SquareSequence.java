package Prime;

//out of 1000 squares, 100 end in 0, 200 end in 1, etc.
public class SquareSequence implements Sequence
{
   private int n;

   public int next()
   {
      n++;
      return n * n; 
   }
}
