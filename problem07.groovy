def isPrime = { N->
  if (N== 1)  return false;
  if (N== 2)  return true;
  if (N== 3)  return true;
  if (N== 4)  return false;
  if (N== 5)  return true;
  if(N%2 == 0) return false;
  if(N%3 == 0) return false;

  //all primes >3 can be written in the form 6k +/- 1

  for(int i=5; i<=Math.ceil(Math.sqrt(N)); i=i+6){
    if(N % i==0) return false;
    if(N % (i+2)==0) return false;
   }
  return true;
}

println LazyList.integersStartingFrom(1).filter(isPrime).get(10000);
