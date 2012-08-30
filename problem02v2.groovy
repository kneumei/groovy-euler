
def fib (f1, f2, maxVal){
  if(f2>maxVal) LazyList.nil()
  else
    new LazyList(f2, {fib(f2, f1+f2, maxVal)})
  }

println fib(1,1,4000000)
  .filter{val -> val%2==0}
  .fold(0){accum, val -> accum+val}

