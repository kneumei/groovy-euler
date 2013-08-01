class problem{
	def run(){
		println LazyList.range(1,1000)
			.filter{n -> (n%3==0)||(n%5==0)}
			.fold(0){accum, val -> accum+val}
	}
}

new problem().run()
