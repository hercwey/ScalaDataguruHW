object HWTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  def sum(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a >= b) acc
      else loop(a+1, f(a) + acc)
    }
    loop(a, 0)
 }                                                //> sum: (f: Int => Int)(a: Int, b: Int)Int
 
 // sum(x => x * x, 2, 4)
  def ff(c:(Int) => Int)(s:Int,z:Int)=c(s)+z      //> ff: (c: Int => Int)(s: Int, z: Int)Int
  def aa(c:Int):Int=c+c                           //> aa: (c: Int)Int
 // val aaaa= aa(4)

  val faa =ff(aa)_                                //> faa  : (Int, Int) => Int = <function2>
  val rr= faa(3,4)                                //> rr  : Int = 10
  println(rr)                                     //> 10
  
    def ffff(cc:(Int,Int) => Int)(s:Int,z:Int)=cc(s,z)+z
                                                  //> ffff: (cc: (Int, Int) => Int)(s: Int, z: Int)Int
//  val sumOfSquares = sum(x => x * x)_
  //val s = someOfSquares(2,4)
}