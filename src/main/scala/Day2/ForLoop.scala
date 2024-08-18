object ForLoop extends App {

  // for loop with range
  for (i <- 1 to 5) {
    println(i)
  }

  // for loop with sequence
  val seq1 = Seq(1, 2, 3, 4)
  for num <- seq1 do println(num)

  val listFromSequence = seq1 // val listFromSequence: List[Int] = seq1
  println(listFromSequence) // it is list

  val seqFromList: Seq[Int] = seq1
  println(seqFromList) // it is Seq

  // nested for loop like 2d array
  for
    i <- 0 to 5
    j <- 0 to 5
  do
    print(s"i=$i j=$j   ")

  // you can also add Condition while iterating
  // let's say odd number till 20
  // also called as guards

  for num <- 1 to 20
      if num % 2 == 1
  do println(num)


  // yield is user to create new List

  val listMultipliedBy2 =
    for num <- seq1
      yield num * 2

  println(listMultipliedBy2) // List

  val statesOfIndia: Map[String, String] = Map("Himachal" -> "Shimla", "Bihar" -> "Patna") // Map, we will cover map operations later
  println(statesOfIndia)

  for (state, capital) <- statesOfIndia // iterate over map in k,v pair
    do
      println(s"The capital of $state is $capital")
}
