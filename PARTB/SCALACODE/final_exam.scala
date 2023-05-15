object final_exam {
  def main(arg: Array[String]): Unit = {
    val list1 = List()
    val list2 = List(22)
    val list3 = List(1, 2, 3)
    val list4 = List(1, 2, 3, 4)
    val list5 = List(1, 2, 3, 4, 5)
    val list6 = List(1, 2, 3, 4, 5, 6)
    println(swapPair(list1) )
    println(swapPair(list2) )
    println(swapPair(list3) )
    println(swapPair(list4) )
    println(swapPair(list5) )
    println(swapPair(list6) )
    println(swapPair(list2))

  }
  def swapPair(li: List[Int]): List[Int] = {
     def process(n:Int , tmp :Int , li:List[Int], ans:List[Int],check:Boolean): List[Int] = {
       if(li.isEmpty){
          if(check){
            return  ans ++ List(tmp)
          }
          else{
            return  ans
          }
       }
       if(n%2 == 0 ){
         return process(n+1 , li.head, li.tail ,ans ,true)
       }
       else{
         return process(n+1 , li.head , li.tail , ans ++ List(li.head) ++ List(tmp) ,false)
       }
     }
     return process(0,0,li, List(),false)
  }
}
