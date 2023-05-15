object Question_5_6430009221 {
  def main(arg: Array[String]): Unit = {
     var l1 = List(1, 2, 5, 2,1)
     println(palindrome(l1))
  }
  def my_reverse(l:List[Any]): List[Any]={
     if(l.isEmpty){
       return List();
     }
    return my_reverse(l.tail) ++ List(l.head);
  }
  def palindrome(list:List[Any]): Boolean={
      var lr = my_reverse(list);
      return process(list,lr)
  }
  def process(l1:List[Any] , l2:List[Any]): Boolean = {
     if(l1.isEmpty){
       return true
     }
     if(l1.head != l2.head){
       return false
     }
     return process(l1.tail,l2.tail);
  }
}
