

object biggerNumber {
  def main(args : Array[String])
  {
    val a = 10
    val b = 20
    val c = 30
    
    if(a >= b && a >= c)
      print("a is greater")
    else if (b >= c)
      print("b is greater")
    else
      print("c is greater")
  }
}