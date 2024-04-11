package scalaExercises

object Exercise2 extends App{

  val words = List("desarrollador", "casa", "inmueble", "balcón", "gato")
  val result = longestWords(words)
  println(s"Palabras largas: $result")

  def longestWords(l: List[String]): List[String] = {
      val longWords = l.filter(_.length > 5)
    longWords.map(_.toUpperCase)
  }

}
