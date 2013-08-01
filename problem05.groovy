class problem{
  def run(){
    def factors = []
    factors.addAll(1..20)
    def factor = 1
    println factors
    for(i in 0..19){
      def hasFactor = false;

      def val1 = factors[i]
      if(val1==1) continue;

      for(j in 0..19){
        if(i==j)
        continue;
        def val2 = factors[j]
        if(val2<val1)
        continue;
        if(val2%val1==0){
          hasFactor=true;
          factors[j]=(Integer)val2/val1;
          factors[i]=factors[j]
        }
      }

      if(hasFactor)
      factor = factor*val1
    }
    println factors
    println factor
    println factors.inject(1){accum, num -> accum * num}*factor 
  }
}

new problem().run()