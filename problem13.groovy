/**
* Problem 13
* Work out the first ten digits of the sum of the following 
* one-hundred 50-digit numbers.
*
* The numbers are stored in problem13.txt. 
*/

def sum = 0l;
new File('problem13.txt').eachLine{ line ->
  sum += (line.substring(0,15)).toLong();
}

println sum
