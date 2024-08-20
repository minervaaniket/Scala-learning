package Day3
case class Dog(name: String)
case class Person(firstName: String, lastName: String)
object Match extends App {
  var day = 3
  var dayName = day match {
    case 1 => "Monday"
    case 2 => "Tuesday"
    case 3 => "Wednesday"
    case 4 => "Thursday"
    case 5 => "Friday"
    case 6 => "Saturday"
    case 7 => "Sunday"
    case _ => "Invalid day" // default case
  } // it's an expression, so it will give back the result to dayName

  println(dayName) // Output: Wednesday

  //    day = 8
  //    dayName = day match {
  //      case 1 => "Monday"
  //      case 2 => "Tuesday"
  //      case 3 => "Wednesday"
  //      case 4 => "Thursday"
  //      case 5 => "Friday"
  //      case 6 => "Saturday"
  //      case 7 => "Sunday"
  //      case invalidOrDefault => invalidOrDefault // it is error because we are trying to put 8 in to String
  //      // invalidOrDefault will hold 8, which is integer and dayName is expecting String, So it will be error
  //    }

  day = 8
  dayName = day match {
    case 1 => "Monday"
    case 2 => "Tuesday"
    case 3 => "Wednesday"
    case 4 => "Thursday"
    case 5 => "Friday"
    case 6 => "Saturday"
    case 7 => "Sunday"
    case defaultValue => defaultValue.toString // default case - will work as we are converting 8 to String
  }

  println(dayName) // 8
  println(dayName.getClass) // class java.lang.String

  val D = 9
  val d = 10
  day = 8
  dayName = day match {
    case 1 => "Monday"
    case 2 => "Tuesday"
    case 3 => "Wednesday"
    case 4 => "Thursday"
    case 5 => "Friday"
    case 6 => "Saturday"
    case 7 => "Sunday"
    case D => "It will take it as pattern" //  it will treat it as a variable and will compare it with 9
    case d => d.toString // here d will be 8, it will not check for d=10, as it will be considered as default case
  }
  println(s"Value should be $dayName not the value of variable $d") // Value should be 8 not the value of variable 10

  var num = 3
  var res: String = try {
    num match
      case 1 => "it is 1"
      case 2 => "it is 2"
  } catch
    case all => s"Exception because none of the patter matches and there is not default case \n $all" // exception will be printed

  println(res) // Exception because none of the patter matches and there is not default case exception

  num = 3
  res = try {
    num match
      case 1 => "it is 1"
      case 2 => "it is 2"
      case 3 => "it is 3"
  } catch
    case all => s"Exception because none of the patter matches and there is not default case \n $all"

  println(res) // It is 3

  num = 3
  res = num match
    case 1 => "it is 1"
    case 2 => "it is 2"
    case t => "this is required as default value"

  println(res) // this is required as default value

  //num = 3
  val evenOrOdd = num match
    case 1 | 3 | 5 | 7 | 9 => "odd"
    case 2 | 4 | 6 | 8 | 10 => "even"
    case _ => "some other number"

  println(evenOrOdd) // odd

  num = 3
  num match
    case 1 => println("one, a lonely number")
    case x if x == 2 || x == 3 => println("two’s company, three’s a crowd") // this will be printed
    case x if x > 3 => println("4+, that’s a party")
    case _ => println("i’m guessing your number is zero or less")

  27 match
    case a if 0 to 9 contains a => println(s"0-9 range: $a")
    case b if 10 to 19 contains b => println(s"10-19 range: $b")
    case c if 20 to 29 contains c => println(s"20-29 range: $c") // this will be printed
    case _ => println("Hmmm...")

  def pattern(x: Matchable): String = x match

    // constant patterns
    case 0 => "zero"
    case true => "true"
    case "hello" => "you said 'hello'"
    case Nil => "an empty List"

    // sequence patterns
    case List(0, _, _) => "a 3-element list with 0 as the first element"
    case List(1, _*) => "list, starts with 1, has any number of elements"
    case Vector(1, _*) => "vector, starts w/ 1, has any number of elements"

    // tuple patterns
    case (a, b) => s"got $a and $b"
    case (a, b, c) => s"got $a, $b, and $c"

    // constructor patterns
    case Person(first, "Alexander") => s"Alexander, first name = $first"
    case Dog("Zeus") => "found a dog named Zeus"

    // type test patterns
    case s: String => s"got a string: $s"
    case i: Int => s"got an int: $i"
    case f: Float => s"got a float: $f"
    case a: Array[Int] => s"array of int: ${a.mkString(",")}"
    case as: Array[String] => s"string array: ${as.mkString(",")}"
    case d: Dog => s"dog: ${d.name}"
    case list: List[?] => s"got a List: $list"
    case m: Map[?, ?] => m.toString

    // the default wildcard pattern
    case _ => "Unknown"

  var marks = List(99,98,100)
  println(pattern(marks)) // a 3-element list with 0 as the first element

  marks = List(1,2)
  println(pattern(marks)) // list, starts with 1, has any number of elements

  println(pattern(Vector(1,2,3,5,6,63,23))) // vector, starts w/ 1, has any number of elements

  println(pattern(Dog("Scala new Dog name"))) // dog: Scala new Dog name
  println(pattern(Map(1->2))) // Map(1 -> 2)
}
