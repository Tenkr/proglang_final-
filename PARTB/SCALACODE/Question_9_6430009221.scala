object Question_9_6430009221 {
  def main(arg: Array[String]): Unit = {
    var tape = List('C','H','A','R')
    println(turingStep(f1, tape, 2))
    println(turingStep(f1, tape, 3))
    println(turingStep(f1, tape, 0))
    println(turingStep(f1, tape, 5))
  }

  def f1 (c: Char): Char= {
    return c.toLower
  }
  def turingStep(f:Char => Char,tape:List[Char], n:Int): List[Char] ={
    return process(f,tape,n,0);
  }
  def process(f:Char => Char,tape:List[Char], n:Int, len:Int): List[Char] ={
     if(tape.isEmpty ){
       return List();
     }
     if(n <= len){
       return List(tape.head) ++ process(f, tape.tail, n, len+1);
     }
    else{
       return List(f(tape.head)) ++ process(f, tape.tail, n, len+1);
     }
  }
}
