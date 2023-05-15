object Question_10_6430009221 {
  def main(arg: Array[String]): Unit = {
    var l1 = List(1,2,3,4,5)
    println(alternate(f1,f2,l1))
  }
  def f1(x1:Int,x2:Int): Int = {
    return x1 + x2;
  }

  def f2(x1: Int, x2: Int): Int = {
    return x1 - x2;
  }
  def alternate(f1: (Int,Int) => Int, f2: (Int,Int) => Int, list:List[Int]):Int={
    if(list.isEmpty){
      return 0
    }
    return process(f1,f2,list.tail, list.head,false);
  }
  def process(f1: (Int,Int) => Int, f2: (Int,Int) => Int, list:List[Int], before:Int , check:Boolean): Int = {
     if(list.isEmpty){
       return before
     }

     if(!check){
       return process(f1,f2,list.tail,f1(before,list.head),true);
     }
    else{
       return process(f1,f2,list.tail,f2(before,list.head),false);
     }
  }
}
