object quiz1_version2 {
  def main(arg: Array[String]): Unit = {
    var l1 = List(1, 2, 3, 4, 5)
    val l: List[Int => Int] = List(f1, f2, f3)
    val l2: List[Int => Int] = List(f1, f2)
    println(identifyMax(1)(l)(1)) //19
    println(identifyMax(2)(l)(2)) //20
    println(identifyMax(3)(l)(3)) //23
    println(identifyMax(4)(l)(4)) //30
    println(identifyMax(5)(l)(5)) //40
    println(identifyMax(6)(l)(6)) //52
    println(identifyMax(4)(l2)(4)) //28
    println(identifyMax(6)(l2)(6)) //48
  }
  def f1(a: Int): Int = a * a - 2 * a + 20
  def f2(a: Int): Int = a * a + 2 * a
  def f3(a: Int): Int = a * a + a + 10
  def identifyMax(x:Int) (l: List[Int=>Int]): Int => Int ={
    return process(x)(l,-9999999,x => x-1000)
  }
  def process(x:Int) (l: List[Int=>Int] , n:Int, fm:Int => Int): Int => Int ={
      if(l.isEmpty){
        return fm
      }
      if(l.head(x) >= n){
        return process(x)(l.tail,l.head(x),l.head)
      }
      else{
         return process(x)(l.tail,n,fm)
      }
  }
}
