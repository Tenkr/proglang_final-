object Question_4_6430009221 {
  def main(arg: Array[String]): Unit = {
     val li = List(3,1,2,-99,8,4)
     println(mergeSort(li));

  }
  def mergeSort(lst: List[Int]): List[Int] = {
    def merge(left: List[Int], right: List[Int]): List[Int] = (left, right) match {
      case (Nil, right) => right
      case (left, Nil) => left
      case (leftHead :: leftTail, rightHead :: rightTail) =>
        if (leftHead < rightHead) leftHead :: merge(leftTail, right)
        else rightHead :: merge(left, rightTail)
    }

    val n = lst.length / 2
    if (n == 0) lst
    else {
      val (left, right) = lst.splitAt(n)
      merge(mergeSort(left), mergeSort(right))
    }
  }

}
