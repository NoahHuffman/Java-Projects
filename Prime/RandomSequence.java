package Prime;

//same as square, but random numbers
public class RandomSequence implements Sequence
{
   public int next()
   {
      return (int) (Integer.MAX_VALUE * Math.random());
   }
}
