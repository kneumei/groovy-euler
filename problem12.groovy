/**
* Problem 12
* What is the value of the first triangle number to have over five hundred divisors?
* Answer: 76576500
* 
* I used a brute force method, with the main optimizaiton being that you only 
* need to check below SQRT(N) for factors of N.
*/

class problem{
	def run(){
		boolean done=false;
		long num=1l;
		long count=1l;
		while(!done){
			if(Factors.factor(num).size()>500) done=true;
			else {
				count++
				num=num+count;
			}
		}

		println num
	}
}

new problem().run()