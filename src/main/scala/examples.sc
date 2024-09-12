import scala.concurrent.Future

val listOfLists = List(List(1, List(11,12)), List(3, 4), List(5))
val flattenedList = listOfLists.flatten
println(flattenedList)

val nestedOption = Some(Some(Some(42)))
val flattenedOption = nestedOption.flatten
println(flattenedOption)

val futureOfFuture = Future.successful(Future.successful(Future.successful(42)))
val flattenedFuture = futureOfFuture.flatten
println(flattenedFuture)

val listWithOptions = List(Some(Some(1)), None, Some(2), None, Some(Some(None)))
val flattenedOptions = listWithOptions.flatten
println(flattenedOptions)

val option = Some(Some(None))
val flatOption = option.flatten
println(flatOption)

//val optionOfOption: Option[Int] = Some(5)
//println(optionOfOption.map(option => Some(option)))
//println(optionOfOption.flatMap(option => Some(option)))

val optionOfOption: Option[Int] = Some(5)
println(optionOfOption.map(option => Some(option)))
println(optionOfOption.flatMap(option => Some(Some(option))))

val list1 = List(1, 2, 3)
val result1 = list1.map(x => {
  Some(List(x * 2))
})
println(result1)
println(result1.flatten)

val list2 = List(1, 2, 3)
val result2 = list1.flatMap(x => {
  Some(List(x * 2))
})
println(result2)

val optList: Option[List[List[Int]]] = Some(List(List(1, 2, 3), List(4,5,6)))
val flattened: List[Int] = optList.getOrElse(List.empty).flatten
println(flattened)

//



