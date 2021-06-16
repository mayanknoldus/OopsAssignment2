object Main {

  def main(args: Array[String]): Unit = {

    val personOne = new Person("Test", 24)
    val personTwo = new Person("Test", 25)
    println(personOne < personTwo)
    println(personOne > personTwo)
    println(personOne <= personTwo)
    println(personOne >= personTwo)
    println(personOne == personTwo)

  }
}