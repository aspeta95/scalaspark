package scalaExercises

object Exercise3 extends App{

  val lista = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val (pares, impares) = countParImpar(lista)
  println(s"Pares: $pares")
  println(s"Impares: $impares")

  def countParImpar(lista: List[Int]): (Int, Int) = {
    val pares = lista.filter(_ % 2 == 0)
    val impares = lista.filter(_ % 2 != 0)
    (pares.length, impares.length)
  }

}
