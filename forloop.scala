

object forloop {
  def main(args : Array[String])
  {
    /*
     for (i <- 1 to (5))
     {
       println("i using to" + i);
     }
           
     for (i <- 1 until 6)
     {
       println("i using until" + i);
     }
     
     for (i <- 1 to 9; j <- 1 to 3)
     {
       println("i using multiple ranges" + i + "" + j);
     }
     
     val lst = List(1,2,3,4,5,6,7,8,9,10);
     for (i <- lst)
     {
       println("i using list" + i);
     }
     
     for (i <- lst; if i < 6)
     {
       println("i using list" + i);
     }
     */
     val lst = List(1,2,3,4,5,6,7,8,9,10);
     for (i <- lst)
     {
       println("i using list with adding 10 is " + (i+10));
     }
     
  }
}