object test01 {
  def main(args: Array[String]): Unit = {
      var li = List(1,4,9,16)
      var l2 = List(2,5,7)
      println(sumAll(List()))
      println(sumAll(List(List())))
      println(sumAll(List(List(1, 2, 3, 4), List(), List(4, 5), List(1, 2, 3, 4, 5, 6))))
      println(sumAll(List(List(3, 4), List(1, 2, 3, 4, 5, 6), List(1, 2, 3, 4))))
      println(sumAll(List(List(1, 2, 3, 4, 5, 6), List(1, 2, 3, 4), List(1, 2), List(0, 0, 0, 0, 0, 0, 0, 0, 9))))
      println(reverse(li))

  }

  def myFilter(f: Int => Boolean)(list: List[Int]): List[Int] = {
     if(list.isEmpty){
       return List()
     }
     if(f(list.head)){
       return List(list.head) ++ myFilter(f)(list.tail)
     }
     else{
       return myFilter(f)(list.tail)
     }
  }
  def sumlist(l1:List[Int] , l2:List[Int]): List[Int]={
     if(l1.isEmpty || l2.isEmpty){
       if(l1.isEmpty){
          return l2
       }
       else{
         return l1
       }
     }
     else{
       return List(l1.head + l2.head) ++ sumlist(l1.tail,l2.tail)
     }
  }
  def process(lists:List[List[Int]] , before: List[Int]) :List[Int] ={
      if(lists.isEmpty){
        return before
      }
      return process(lists.tail , sumlist(before,lists.head))
  }
  def sumAll(lists:List[List[Int]]) :List[Int] ={
     return process(lists,List())
  }
  def reverse(list: List[Any]): List[Any]={
      if(list.isEmpty){
        return List()
      }
      return reverse(list.tail) ++ List(list.head)
   }
}
