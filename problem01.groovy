class problem {
	def range = 1..<1000
	
	def run(){
		println range
			.findAll{n -> ( (n%3==0)||(n%5==0))}
			.inject(0){acc, val -> acc + val}
		}
}

new problem().run();



