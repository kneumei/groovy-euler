/**
* Copied from http://groovy.codehaus.org/Functional+Programming+with+Groovy
*/
class LazyList {
    def head
    private Closure tail
    
    LazyList(def head, Closure tail) { this.head=head; this.tail=tail }
    
    def LazyList getTail() { tail==null ? nil() :  tail.call() }

    static LazyList nil() {
        new LazyList( null,{-> null} )
    }

    def LazyList filter(Closure matchExpr) {
        if(head==null)
          return nil();
        if (matchExpr(head))
            return new LazyList(head, { getTail().filter(matchExpr) })
        else{
            return getTail().filter(matchExpr)
        }
    }

    def each(Closure proc){
      if(head != null){
       proc(head)
       getTail().each(proc);
      }
    }

    def fold(accumulator, Closure proc){
      if(head==null)
        return accumulator
      return tail().fold(proc.call(accumulator, head), proc);
    }

    def LazyList map(Closure proc){
      if(head==null)
        return nil();
      return new LazyList(proc.call(head), {getTail().map(proc)})
    }

    def List getHead(n) {
      def valuesFromHead = [];
      def current = this
      for(i in 0..n){
        if(current.head==null)
          return valuesFromHead;
        valuesFromHead << current.head
        current = current.tail
      }
      valuesFromHead
    }

    def get(i){
      return getHead(i+1)[i]
    }
   

    static LazyList range (a,b){ if (a>b) LazyList.nil() else new LazyList(a, {range(a+1, b)})}

    static LazyList reverseRange (a,b){ if(b>a) LazyList.nil() else new LazyList(a, {reverseRange(a-1, b)})}

    static LazyList integersStartingFrom (n){return new LazyList(n, {integersStartingFrom(n+1)})} 

}



