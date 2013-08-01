/**
* Problem 9
* There exists exactly one Pythagorean triplet for which a + b + c = 1000.
* Find the product abc.
*
* Answer: 31875000
*
* This solution uses a brute force apporach that would scale poorly (O(n^2)).
* This answer is described in the answer sheet for the project euler question.
* I had originally come up with a similar solution, except that c was in the 
* outer-loop but I found the the bounds easier to understand when a is in the 
* outer loop instead.
*/

class problem{
	def run(){
		long answer = 0
		for(a in 3..(1000/3)){
			for(b in (a+1)..1000-1-a){
				c = 1000 - a - b;

				if((a*a + b*b) == c*c){
					println "a: ${a} b: ${b} c: ${c}" 
					answer = a * b * c;
				}
			}
		}

		println answer
	}
}

new problem().run();