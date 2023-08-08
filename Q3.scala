package Demo7

object Q3 extends App{

  val ints = List(1,2,3,4,5,6,7,8,9,10): List[Int]
  val findPrime = ints.map((i:Int)=> !(2 to (i-1)).exists(x => i % x == 0) )

  println(findPrime)
}
