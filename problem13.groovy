/**
* Problem 13
* Work out the first ten digits of the sum of the following 
* one-hundred 50-digit numbers.
*
* The numbers are stored in problem13.txt. 
* ANSWER: 5537376230
*/



class problem{
	def run(){
		BigInteger bi = new BigInteger(0);
		new File('problem13.txt').eachLine{ line ->
			bi = bi.add(new BigInteger(line));
		}

		println bi.toString().substring(0,10);
	}
}

new problem().run()

