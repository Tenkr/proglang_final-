object Question_2_6430009221 {
  def main(arg: Array[String]): Unit = {
    var list = List(1, 2, 4, 5)
    println(insertInOrder(4,list));
  }
  def insertInOrder(x:Int,list:List[Int]): List[Int]={
      return process(x,list,-999999, false)
  }
  def process(x:Int,list:List[Int],before:Int,check:Boolean): List[Int]={
      if(list.isEmpty){
        return List()
      }
      if(before <= x && x <= list.head && !check){
        return List(x) ++ List(list.head) ++ process(x,list.tail,list.head,true);
      }
      else{
        return List(list.head) ++ process(x,list.tail,list.head,check);
      }
  }
}
