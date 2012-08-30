def isPrime = { N->
  if(N==2) return true;
  for(i in 2..Math.sqrt(N)){
    if(N%i==0)
     return false;
   }
    return true;
}

println LazyList.integersStartingFrom(1).filter(isPrime).get(10000);
