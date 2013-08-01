/*
* Problem 10
* Find the sum of all the primes below two million.
* Answer: 142913828922
*
* This answer generates all numbers up to two million, then screens each one
* for being prime, then calculates the product.  The method to calculate 
* isPrime() was used by a different problem.  One trick is that the accumulator
* must be a long. 
*
* Another solution would be to use the Sieve of Eratosthenes to generate 
* only prime numbers.
*/

class problem{
	def run(){
		def range = 1..2000000

		println range.findAll{n -> Primes.isPrime(n)}.inject(0l,{x,accum-> x+accum})
		}
}

new problem().run();