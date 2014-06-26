object myTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  import scala.math._
  val num=3.14                                    //> num  : Double = 3.14
  val fun = ceil _                                //> fun  : Double => Double = <function1>
  fun(num)                                        //> res0: Double = 4.0
  Array(3.14,1.42,2.0).map(fun)                   //> res1: Array[Double] = Array(4.0, 2.0, 2.0)
  var triple = (x: Double)=>3*x                   //> triple  : Double => Double = <function1>
  Array(3.14,1.42,2.0)map((x:Double)=>x*3)        //> res2: Array[Double] = Array(9.42, 4.26, 6.0)
  def valueAt(f:(Double)=>Double) = f(0.25)       //> valueAt: (f: Double => Double)Double
  valueAt(ceil _)                                 //> res3: Double = 1.0
  def test(a:Double):Double={ a+a }               //> test: (a: Double)Double
  valueAt(test _)                                 //> res4: Double = 0.5
}