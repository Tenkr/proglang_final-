object Question_8_6430009221 {
  def main(arg: Array[String]): Unit = {
    val matrix = List(List(1, 2, 3), List(4, 5, 6,7), List(7, 8, 9),List())
    println(sumAll(List()))
    println(sumAll(List(List())))
    println(sumAll(List(List(1, 2, 3, 4), List(), List(4, 5), List(1, 2, 3, 4, 5, 6))))
    println(sumAll(List(List(3, 4), List(1, 2, 3, 4, 5, 6), List(1, 2, 3, 4))))
    println(sumAll(List(List(1, 2, 3, 4, 5, 6), List(1, 2, 3, 4), List(1, 2), List(0, 0, 0, 0, 0, 0, 0, 0, 9))))

  }
  def sumAll(lists:List[List[Int]]) :List[Int] = {
     return process(lists,List());
  }
  def process(lists:List[List[Int]], before:List[Int]) :List[Int] ={
    if(lists.isEmpty){
      return before
    }
    var li =lists.head;
    return process(lists.tail,sumlist(li,before))

  }
  def sumlist(li1:List[Int] , li2:List[Int]):List[Int] ={
     if(li1.isEmpty || li2.isEmpty){
       if(li1.isEmpty){
         return li2
       }
       else{
         return li1
       }
     }
    else{
       return List(li1.head + li2.head) ++ sumlist(li1.tail,li2.tail)
     }
  }
}
