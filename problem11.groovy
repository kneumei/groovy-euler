/**
* Problem 11
* 
* What is the greatest product of four adjacent numbers in any direction 
* (up, down, left, right, or diagonally) in the 20×20 grid?
*
* See problem11.txt for grid
* Answer: 1788696
*
*/
class problem{
  def grid = []
  
  public int getNumber(grid, i, j){
    if( (i > (grid.size()-1)) || i < 0) return 0;
    if( (j > (grid[i].size()-1)) || j < 0) return 0;
    return grid[i][j]
  }

  public take4(grid,i,j,rowInc,colInc){
    def nums=[];
    for(int k=0; k<4; k++)
    nums.add(getNumber(grid, rowInc.call(i,k), colInc.call(j,k)))
    return nums
  }

  public getRow(grid,i,j){
    return take4(grid,i,j,{rowIndex,k -> rowIndex}, {colIndex,k -> colIndex+k})
  }

  public getCol(grid,i,j){
    return take4(grid,i,j,{rowIndex,k -> rowIndex+k}, {colIndex,k -> colIndex})
  }

  public getDiagSE(grid,i,j){
    return take4(grid,i,j,{rowIndex,k -> rowIndex+k}, {colIndex,k -> colIndex+k})
  }

  public getDiagNE(grid,i,j){
    return take4(grid,i,j,{rowIndex,k -> rowIndex+k}, {colIndex,k -> colIndex-k})
  }

  

  def run(){
    def maxProduct = 0l
    new File('problem11.txt').eachLine{ line ->
      def row = []
      line.split(" ").each{ x -> row.add(x.toInteger())}
      grid.add(row);
    }

    for(int i=0; i<grid.size(); i++){
      for(int j=0; j<grid[i].size(); j++){

        maxProduct = Math.max( maxProduct, 
          getRow(grid,i,j).inject(1l){x,accum -> x*accum});

        maxProduct = Math.max( maxProduct,
          getCol(grid,i,j).inject(1l){x,accum -> x*accum});

        maxProduct = Math.max(maxProduct,
          getDiagNE(grid,i,j).inject(1l){x,accum -> x*accum});

        maxProduct = Math.max(maxProduct,
          getDiagSE(grid,i,j).inject(1l){x,accum ->x*accum});

      }
    }
    println maxProduct
  }

}

new problem().run();