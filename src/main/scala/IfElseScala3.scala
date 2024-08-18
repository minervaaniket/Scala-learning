object IfElseScala3 extends App {
  val a = 5

  //Single line
  if a == 5 then println("A is 5") else println("A is not 5") // prints A is 5

  //Multiple lines
  if a != 5 then
    println("A is not 5")
    println("Multiple lines")
  else
    println("A is 5") // this will get printed as a = 5
    println("Multiple lines")


  // Nested
  val percentage = 88

  val grades = if percentage >= 90 then
    "Excellent"
  else if percentage < 90 && percentage > 60 then
    "Average"
  else if percentage < 60 && percentage > 33 then
    "Passed"
  else "Failed"

  println(grades) // Average

  val marks1 = 88;
  val marks2 = 98;

  //ternary-Like behaviour
  val maxMarks = if marks1 > marks2 then marks1 else marks2
  println(maxMarks) // 98
}
