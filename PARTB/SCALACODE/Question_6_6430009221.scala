object Question_6_6430009221
{
  def main(arg: Array[String]): Unit = {
    var l1 = List(1, 2, 5, 2, 1)
    println(myMap(squre)(l1))
  }
  def myMap(f:Int => Int) (list:List[Int]) :List[Int] = {
      if(list.isEmpty){
        return List()
      }
      return List(f(list.head) ) ++ myMap(f)(list.tail);
  }
  def squre(x:Int): Int={
     return x*x;
  }
}
