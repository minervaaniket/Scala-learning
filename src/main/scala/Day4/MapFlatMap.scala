package Day4

object MapFlatMap extends App{
  // def map[B](f: A => B): M[B]

  var list1 = List(1, 2, 3)
  var result1 = list1.map(x => {
    println(s"Notice here I am $x")
    Some(List(x * 2))
  })
  println(result1)

  // def flatMap[B](f: A => M[B]): M[B]

  var list2 = List(1, 2, 3)
  var result2 = list2.flatMap(x => {
    println(s"Notice here I am $x")
    List(x * 2)
  })
  println(result2)

  val listOfList1 = List(List(1, 2), List(3, 4))
  val result3 = listOfList1.map(x => {
    println(x)
    x
  })
  println(result3)
  val listOfList2 = List(List(1, 2), List(3, 4))
  val result4 = listOfList2.flatMap(x => {
    println(x)
    x
  })
  println(result4)

  val option = Some(2)
  val resultMap = option.map(x => Some(x * 2)) // Some(Some(4))
  val resultFlatMap = option.flatMap(x => Some(x * 2)) // Some(4)

  // visit the article for all the examples
  //https://medium.com/@minervaaniket/map-flatmap-scala-fc3a43ee5cd8
}
