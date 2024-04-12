package scalaExercises

object Exercise4 extends App{

  val palabras = List("Scala", "Java", "python", "Javascript", "Rust")
  val media = mediaPalabras(palabras)
  println(s"LA media de letras es: $media")

  def mediaPalabras(lista: List[String]): Double = {
    val palabras = lista.filter(s => s.exists(_.isUpper) && s.exists(_.isLower))
    val longitudes = palabras.map(_.length)
    if (longitudes.nonEmpty) longitudes.sum.toDouble / longitudes.length
    else 0.0
  }



}
