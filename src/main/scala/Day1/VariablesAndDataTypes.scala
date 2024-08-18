package Day1

object VariablesAndDataTypes extends App{
  var a = 10
  println(a)  // prints 10

  a = 20      // content can be changed because the type is var
  println(a)  // prints 20

  val b = 10
  println(b) // prints 10

  // b = 20 // Not Allowed - content can not be changed because the type is val


  val x: Int = 10 // explicit mention to Int type
  val y = 10  // implicit, the compiler will infer it to Int type

  val anyList = List(1, "random",  3.0) // implicit to type Any
  println(anyList)

  val part1 = "Scala"
  val part2 = "is"
  val part3 = "tough"

  println(s"Everyone think $part1 $part2 $part3")

  val student1Marks = 90.0
  val student2Marks = 95.0

  println(s"Average of marks = ${(student1Marks + student2Marks)/2}")

  val multiLineStringNormal =
    """
      My name
    is
      Aniket
      """

  println(multiLineStringNormal) // it will get printed as you see above, the indentation will be same

  val multiLineStringWithIndentation =
    """
      |Hello
    |This is a new Line
    |Check now
      |""".stripMargin

  println(multiLineStringWithIndentation) // this will be left aligned in multiple lines, as below
  //  Hello
  //  This is a new Line
  //  Check now

  val pi = 3.14159
  val formatted = f"Area of circle with radius 5 is approximately ${(pi*5*5)}%.2f"
  println(formatted)
  // This creates the string: "Area of circle with radius 5 is approximately 78.54."

  val escapedString = raw"This is a newline: \n But it won't break the line. because raw interpolator is used"
  println(escapedString)
  // This creates the string: "This is a newline: \n But it won't break the line."
}
