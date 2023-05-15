object Quiz1_sec02_version_1 {
  def main(args: Array[String]): Unit = {
      println(applySeq(1)(List((x => x+1), (x => x*x),(x => x+5)) ))
      println(applySeq(100)(List()))
      println(3/2 + 3%2)
      val l00 = List()
      val l01 = List()
      val l1 = List(1, 4, 3, 2, 7, 8)
      val l2 = List(2, 9, 7, 1, 6, 10)
      val l3 = List(12, 11, 6, 5, 3, 2)
      val l4 = List("1", "2", "3", "4", "5")
      val l5 = List("9", "7", "5", "3", "1")
      val l6 = List("2", "4", "6", "8", "10")
      println(moreThanHalf(l4, l5))

  }
  def applySeq(x:Int) (fList: List[Int=>Int]): Int = {
      if(fList.isEmpty){
        return x
      }
      else{
        return applySeq(fList.head(x))(fList.tail)
      }
  }
  def moreThanHalf(l1:List[Any],l2:List[Any]):Boolean ={
      return process(l1,l2,0,l1.length/2 + l1.length%2);
  }
  def process(l1:List[Any],l2:List[Any], len:Int , n:Int): Boolean = {
    if (len >= n) {
      return true;
    }
     if(l1.isEmpty){
        return false
     }
     if(member(l1.head,l2)){
        return process(l1.tail,l2,len+1,n);
     }
     else{
        return process(l1.tail,l2,len,n);
     }
  }
  def member(x:Any, l:List[Any]): Boolean={
     if(l.isEmpty){
       return false;
     }
     if(x == l.head){
       return true;
     }
     else{
       return member(x,l.tail);
     }
  }
}
