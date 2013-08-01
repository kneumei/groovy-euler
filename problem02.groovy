class problem{
	def run(){
		def sum = 0;
		def fibVal=0;
		def oldFibVal=1;		

		while(fibVal<4000000){
			def tempFibVal = fibVal
			fibVal = fibVal + oldFibVal;
			oldFibVal = tempFibVal;
			if(fibVal % 2 == 0)
			sum = sum + fibVal;
		}		

		println sum
	}
}

new problem().run()
