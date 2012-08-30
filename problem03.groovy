
def factor(N){
  def i = 2;
  def max = N;
  def factors = [];
  
  while(i<max){
    if(N%i==0){
      factors << i;
      factors << (Integer)(N/i);
    }
    i++
    max = N/i;
  }
  return factors;
}

def isPrime(N){
  for(i in 2..N/2){
    if(N%i==0)
     return false;
  }
    return true;
}

println factor(600851475143).findAll{x -> isPrime(x)}.max()

