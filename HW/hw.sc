object hw {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  (1 to 9).map("1"* _).foreach(println _ )        //> 1
                                                  //| 11
                                                  //| 111
                                                  //| 1111
                                                  //| 11111
                                                  //| 111111
                                                  //| 1111111
                                                  //| 11111111
                                                  //| 111111111
    //printf("%%ds".format((3 - 1) * 3),"a")
  printf("%6d",1)                                 //>      1
   printf("%s","ok")                              //> ok
    printf("%%%ds".format((4- 1) * 3), "a")       //>         a
     println("End")                               //> End

}