object Question_7_6430009221
{
  def main(arg: Array[String]): Unit = {
    var l1 = List(1, 2, 5, 2, 1)
    println(myFilter(x => x%2 == 0)(l1))
  }
   def myFilter(f:Int => Boolean)(list: List[Int]): List[Int]={
      if(list.isEmpty){
        return List()
      }
      if(f(list.head)){
        return List(list.head) ++ myFilter(f)(list.tail);
      }
     else{
        return myFilter(f)(list.tail);
      }
   }
}
