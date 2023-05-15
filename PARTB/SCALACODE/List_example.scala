object List_example {
    def main(arg:Array[String]): Unit={
        var myList = List(1,2,3,4,-1,1,1);
        var x = 1
        x = 2
        println(find(4,myList));
    }
    def find(x:Int , ls:List[Int]): Boolean={
        if(ls.isEmpty){
            return  false
        }

        if(x == ls.head) {
            return true
        }
        else{
            return find(x,ls.tail)
        }
    }
    def member(x:Any , l:List[Any]): Boolean={
        if(l.isEmpty){
            return false;
        }
        println(l.head);
        if(l.head == x){
            return true
        }
        else{
            return member(x,l.tail);
        }
    }
    def insertLast(x:Any , l:List[Any]): List[Any] ={
        return l ++ List(x);
    }
    def sorted(l:List[Int]): Boolean ={
        if(l.isEmpty || l.length == 1){
            return true;
        }
        if(l.head > l.tail.head){
            return false
        }
        else{
            return sorted(l.tail);
        }
    }
    def delete(x:Any, l:List[Any]):List[Any]={
        if(l.isEmpty){
            return List();
        }
        if(l.head == x){
            return delete(x,l.tail);
        }
        else{
            return List(l.head) ++  delete(x,l.tail);
        }
    }
    def mylenght(l:List[Any]): Int ={
        if(l.isEmpty){
            return 0
        }
        return 1 + mylenght(l.tail);
    }
    def myReverse(l:List[Any]): List[Any] = {
        if(l.isEmpty){
            return List()
        }
        else{
            return myReverse(l.tail) ++ List(l.head);
        }
    }
    var max_val = -99999;
    def max(l:List[Int]):Unit={
        if(l.isEmpty){
            return
        }
        if(l.head > max_val){
            max_val = l.head;
        }
        max(l.tail);
    }
    def setify(l:List[Any]):List[Any]={
        if(l.isEmpty){
            return List()
        }
        if(member(l.head,l.tail)){
            return setify(l.tail)
        }
        else{
            return List(l.head) ++ setify(l.tail)
        }
    }
}
