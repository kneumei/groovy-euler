class problem{
  def isPalindrome = { x-> 
    x.toString().equals(x.toString().reverse())
  }

 def largestP = 0

 def run(){
  for (a in 999..100){
    def p = LazyList.reverseRange(999,100)
      .map{x -> x * a}
      .filter(isPalindrome)
      .get(0)

    if(p!=null){
      if(p > largestP){
        println p + "(" + a + "x" + p/a + ")"
        largestP = p
      }
      else break;
      }
    }
    println largestP
  }
}

new problem().run()
