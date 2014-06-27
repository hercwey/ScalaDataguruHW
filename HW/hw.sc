object hw {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  (1 to 9).map("1" * _).foreach(println _)        //> 1
                                                  //| 11
                                                  //| 111
                                                  //| 1111
                                                  //| 11111
                                                  //| 111111
                                                  //| 1111111
                                                  //| 11111111
                                                  //| 111111111
  //printf("%%ds".format((3 - 1) * 3),"a")
  printf("%6d", 1)                                //>      1
  printf("%s", "ok")                              //> ok
  printf("%%%ds".format((4 - 1) * 3), "a")        //>         a
  "%%%ds".format((4 - 1) * 3)                     //> res0: String = %9s
  "%%%ds".format(5)                               //> res1: String = %5s
  def mulBY(factor: Double) = (x: Double) => factor * x
                                                  //> mulBY: (factor: Double)Double => Double
  val triple = mulBY(3)                           //> triple  : Double => Double = <function1>
  val half = mulBY(0.5)                           //> half  : Double => Double = <function1>
  println(triple(14) + "  " + half(14))           //> 42.0  7.0

  import math.abs

  def accuracy(f: () => Double)(t: Double) = { abs(f()) < abs(t) }
                                                  //> accuracy: (f: () => Double)(t: Double)Boolean


  def acc1(a: Double, b: Double) = accuracy({ ()=>(a - b * b) * (a - b * b) })(0.00001)
                                                  //> acc1: (a: Double, b: Double)Boolean

  acc1(1, 2)                                      //> res2: Boolean = false

  acc1(1, 1.0001)                                 //> res3: Boolean = true

 // def accuracy1(f:(Double,Double)=>Double))(t:Double)=>f>t
  def accuracy1(f:(Double,Double)=>Double)(c:Double)=f+_
                                                  //> accuracy1: (f: (Double, Double) => Double)(c: Double)String => String

  def tt(x:Double,y:Double)=x+y                   //> tt: (x: Double, y: Double)Double
  val t2=tt(2.00,3.00)                            //> t2  : Double = 5.0
 // val t3=accuracy1(t2,"qq")
  println("End")                                  //> End

}