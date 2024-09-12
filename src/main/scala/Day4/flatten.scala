package Day4

import scala.concurrent.Future

object flatten extends App{
  val nestedOption = Some(Some(Some(42)))
  val flatOption = nestedOption.flatten
  println(flatOption.flatMap(x => Some(x)))
  println(flatOption)

  val futureOfFuture = Future.successful(Future.successful(Future.successful(42)))
  val flattenedFuture = futureOfFuture.flatten // Future(42)

  println(flattenedFuture)

  val listWithOptions = List(Some(Some(1)), None, Some(2), None, Some(3))
  val flattenedOptions = listWithOptions.flatten // List(1, 2, 3)
  println(flattenedOptions)

  val listOfLists = List(List(1, 2), List(List(3, 4)), List(5))
  val flattenedList = listOfLists.flatten // List(1, 2, 3, 4, 5)
  println(flattenedList)

  // visit the article for all the examples
  //https://medium.com/@minervaaniket/map-flatmap-scala-fc3a43ee5cd8
}
