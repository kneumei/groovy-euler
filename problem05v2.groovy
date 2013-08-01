
class problem{
	
	def run(){
		def factors = []
		def val = null;
		factors.addAll(1..20)

		def accum = 1;
		for(i in 0..19){
			println factors
			val = factors[i];
			accum = accum * val
			factors = factors.collect{x -> x%val==0 ? (Integer)(x/val) : x}
		}

		println  accum
	}
}

new problem().run();
