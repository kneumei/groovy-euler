class problem{
	def run(){
		def range = 1..100

		def sumOfSquares =  (range.collect{x-> (Integer)Math.pow(x,2)}.inject(0){accum, x -> accum + x});

		def squareOfSum = (Integer)Math.pow(range.inject(0){accum, x -> accum + x}, 2);


		println squareOfSum - sumOfSquares;
	}
}

new problem().run()
