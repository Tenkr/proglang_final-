object Quiz1_prepare {
    def main(arg:Array[String]): Unit={
        var x = List(3,4,2,1,6)
        println(mergeSort(x));
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
