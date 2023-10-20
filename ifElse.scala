

object ifElse {
  def main(args : Array[String])
  {
  val a = 10
  val b = 15
  val c = a + b
  
  
  println("Addition of $a and $b is $c")
  println("Addition of " + a + " and " + b + " is " + c)
  if(a != b)
    print("Value of a is not equal to b")
  else
    print("Value is a equal to b")
  }
 }
  