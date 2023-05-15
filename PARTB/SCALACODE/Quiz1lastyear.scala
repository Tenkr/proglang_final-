object Quiz1lastyear {
  def main(arg: Array[String]): Unit = {
    val l1 = List(1, 2, 3, 4, 5)
    println(compliment((x => x * x))(-5)) // -25
    println(compliment((x => x * x))(3)) // -9
    val c = compliment(test1)
    println(c(3))
    println(c(3000))
  }
  def test1(x:Int):Int={
    return x -1000
  }
  def f1(x: Int): Boolean = {
    x % 2 == 1
  }

  def f2(x: Int): Boolean = {
    x * x > 10
  }
  def process(l: List[Int], f: Int => Boolean , tli: List[Int] , fli:List[Int]): List[List[Int]] = {
     if(l.isEmpty){
        return List(tli, fli);
     }
     if(f(l.head)){
       return process(l.tail, f, tli ++ List(l.head) , fli);
     }
     else{
       return process(l.tail,f, tli, fli ++ List(l.head))
     }
  }
  def partition(l: List[Int], f: Int => Boolean): List[List[Int]] = {
      return process(l,f,List(),List());
  }
  def compliment(f:Int => Int):Int => Int = {
      return (x:Int) => -1*f(x)
  }

}