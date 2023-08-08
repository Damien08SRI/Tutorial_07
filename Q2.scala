package Demo7

object Q2 extends App{

  val intS = List(1,2,3,4,5): List[Int]
  val findSquare = intS.map((x:Int) => x*x)
  println(findSquare)

}
