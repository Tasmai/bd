

object display {
  def main(args : Array[String])
  {
    val name = "tasz"
    val age = 23
    println(name + " is of " + age + " years old ")
    println(s"$name is of $age years old. \n he is alpha ") //s is for string
    println(raw"$name is of $age years old. \n he is alpha ") //raw is to write as it is
  }
}