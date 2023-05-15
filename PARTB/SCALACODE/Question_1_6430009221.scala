object Question_1_6430009221 {
  def main(arg: Array[String]): Unit = {
    println(maxAll(List()))
    println(maxAll(List(List())))
    println(maxAll(List(List(1, 2, 3, 4, 8, 9), List(), List(4, 5), List(1, 2, 3, 5, 6, 10, 11))))
    println(maxAll(List(List(3, 4), List(1, 2, 3, 4, 51, 61), List(1, 2, 31, 41, 61, 51))))
    println(maxAll(List(List(1, 2, 3, 40, 5, 6), List(10, 2, 30, 4), List(1, 200), List(0, 0, 0, 0, 0, 0, 0, 0, 9))))
  }
  def insertLast(x:Any, l:List[Any]) :  List[Any] ={
      return l ++ List(x);
  }
  def insertAtposition(list: List[Any] , x:Any ,pos:Int): List[Any] ={
      def process(list: List[Any] , curr:Int , x :Any , pos:Int): List[Any] = {
         if(list.isEmpty){
            return  List()
         }
         if(pos == curr){
           return List(x) ++ process(list,curr+1 , x,pos)
         }
         else{
           return  List(list.head) ++ process(list.tail , curr+1 , x , pos);
         }
      }
      return process(list,0,x,pos)
  }
  def maxAll(lists:List[List[Int]]) :List[Int] = {
      def process(list: List[List[Int]] ,before:List[Int]): List[Int] ={
         if(list.isEmpty){
           return before
         }
         else{
           return process(list.tail,max_inside(before,list.head))
         }
      }
      return  process(lists,List())
  }
  def max_inside(l1:List[Int] , l2: List[Int]): List[Int] = {
      if(l1.isEmpty && l2.isEmpty){
         return  List()
      }
      if(l1.isEmpty){
        return  List(l2.head) ++ max_inside(l1,l2.tail);
      }
      if(l2.isEmpty){
        return List(l1.head) ++ max_inside(l1.tail,l2)
      }
      if(l1.head < l2.head){
        return  List(l2.head) ++ max_inside(l1.tail,l2.tail);
      }
      else{
        return  List(l1.head) ++ max_inside(l1.tail , l2.tail);
      }
  }


}
