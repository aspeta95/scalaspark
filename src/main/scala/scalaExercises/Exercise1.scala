package scalaExercises

object Exercise1 extends App {

  val l = List(10, 20, 30, 45, 70, 100, 40, 10)
  val secondBigger = secondBiggerFunc(l)
  secondBigger match {
    case Some(second) => println(s"Segundo más grande: $second")
    case None => println("Hacen falta más números")
  }

  def secondBiggerFunc(l: List[Int]): Option[Int] = {
    val uniqueSorted = l.distinct.sorted
    if (uniqueSorted.length < 2) None
    else Some(uniqueSorted(uniqueSorted.length - 2))
  }

}
