class Factors{

  static int[] factor(N){
    def i = 1;
    def factors = [];
    
    while(i<Math.ceil(Math.sqrt(N))){
      if(N%i==0){
        factors << i;
        factors << (Integer)(N/i);
      }
      i++
    }
    return factors;
  }
}
