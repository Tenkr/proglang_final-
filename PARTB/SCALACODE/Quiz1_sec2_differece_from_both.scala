object Quiz1_sec2_differece_from_both {
    def main(args: Array[String]): Unit = {
        val l1 = List(5, 1, 2, 4)
        val l2 = List(10, 2, 4, 6, 8)
        println(differenceFromBoth(List(), l2)) // List(10, 2, 4, 6, 8)
        println(differenceFromBoth(l1,l2))
    }
    def differenceFromBoth(l1:List[Any],l2:List[Any]):List[Any]={
        return process(l2,l1,process(l1,l2,List()) )
    }
    def process(l1:List[Any], lm1:List[Any] , ans:List[Any]):List[Any] ={
        if(lm1.isEmpty){
            return ans
        }
        if(member(lm1.head,l1)){
            return process(l1,lm1.tail,ans)
        }
        else{
            return process(l1,lm1.tail,ans ++ List(lm1.head))
        }
    }
    def member(x:Any, list:List[Any]): Boolean= {
        if(list.isEmpty){
            return false
        }
        if(x == list.head){
            return true
        }
        else{
            return member(x,list.tail)
        }
    }
}
