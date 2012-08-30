def range = 1..100

def sumOfSquares =  (range.collect{x-> (Integer)Math.pow(x,2)}.inject{accum, x -> accum + x})

def squareOfSum = (Integer)Math.pow(range.inject{accum, x -> accum + x}, 2)

println squareOfSum - sumOfSquares
