

object calci {
  def main(args : Array[String])
  {
    val num1 = 10
    val num2 = 20
    
    val answer = 3
    
    
    if (answer == 1)
      print("Addition is " + (num1+num2) )
    else if (answer == 2)
      print("Substraction is " + (num1-num2) )
    else if (answer == 3)
      print("Multiplication is " + (num1*num2) )
    else if (answer == 4)
      print("Division is " + (num1/num2) )
    else
      print("Wrong choice")
  }
}