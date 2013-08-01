class problem{
	def run(){
		println LazyList.integersStartingFrom(1).filter{x->Primes.isPrime(x)}.get(10000);
	}
}
new problem().run()