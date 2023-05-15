object Question_3_6430009221 {
    def main(arg:Array[String]): Unit={
       var l1 = List(1,2,4,5)
       var l2 = List(1,2,4,5,9)
       println(subList(l1,l2));
    }
    def member(x:Any, list:List[Any]): Boolean={
       if(list.isEmpty){
         return false
       }
       if(list.head == x){
         return true
       }
      else{
         return member(x,list.tail);
       }
    }
    def subList(l1:List[Any], l2:List[Any]):Boolean={
       if(l1.isEmpty){
         return true;
       }
       if(member(l1.head,l2)){
         return subList(l1.tail,l2)
       }
      else{
         return false
       }
    }


}
