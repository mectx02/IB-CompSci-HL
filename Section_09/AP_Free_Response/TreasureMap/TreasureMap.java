package HL_1.Section_09.AP_Free_Response.TreasureMap;

public class TreasureMap 
{ 
    private boolean[][] myGrid;   // myGrid[r][c] being true indicates a treasure at (r, c) 
                                  // the matrix is sized by the constructor
    // constructor                             
    public TreasureMap(boolean [][] map)
    {
    	myGrid = map;
    }
    
    // part (a)
    // returns true if the cell at location (row, col)
    // contains a treasure;
    // returns false if location (row, col) is not within
    // the bounds of the grid or if there is no treasure 
    // at that location 
    public boolean hasTreasure(int row, int col)
    {
        if (row < myGrid.length && col < myGrid[0].length)
            return myGrid[row][col];

        return false;
        
    }
     
    // part (b)
    // precondition:    0 <= row < NumRows(); 0 <= col < NumCols()
    // returns a count of the number of treasures in the
    // cells adjacent to the location (row, col),
    // horizontally, vertically, and diagonally
    public int numAdjacent(int row, int col)
    {   
        int total;
        if (hasTreasure(row, col) == true)
            total = -1;
        else
            total = 0;
        
        
        if (row - 1 > 0 && col - 1 > 0) {
            
            for (int r = row - 1; r < row + 2; r++) {
                
                for (int c = col - 1; c < col + 2; c++) {
                    
                    if (hasTreasure(r, c) == true)
                        total++;
                    
                }
                
            }
            
        }
        
        return total;
    } 
    
    
    // returns the number of rows in the treasure map 
    public int numRows()
    {   
       return myGrid.length;
    }

    
    // returns the number of columns in the treasure map
    public int numCols()
    {
    	return myGrid[0].length;
    }
    
}