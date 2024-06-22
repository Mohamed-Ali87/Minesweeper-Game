//Link to video: https://youtu.be/2sRB24D2wPE
//package MineSweeper;
package MineSweeper;

import java.util.Random;


public class Grid {

	private boolean[][] bombGrid;
	private int[][] countGrid;
	private int numRows;
	private int numColumns;
	private int numBombs;
	
	
	public Grid() {
		numRows = 10;
		numColumns = 10;
		numBombs= 25;
		bombGrid = new boolean[numRows][numColumns];
		countGrid = new int[numRows][numColumns];
		
		createBombGrid();
		createCountGrid();
		
	}
	
	public Grid(int rows, int columns) {
		numRows = rows;
		numColumns = columns;
		numBombs = 25;
		bombGrid = new boolean[rows][columns];
		countGrid = new int[rows][columns];
		
		createBombGrid();
		createCountGrid();
	}
	
	public Grid(int rows, int columns, int numBombs) {
		numRows = rows;
		numColumns = columns;
		this.numBombs = numBombs;
		bombGrid = new boolean[rows][columns];
		countGrid = new int[rows][columns];
	
		createBombGrid();
		createCountGrid();
	}

	public int getNumRows() {
		return numRows;
	}

	public int getNumColumns() {
		return numColumns;
	}

	public int getNumBombs() {
		return numBombs;
	}
	
	public boolean[][] getBombGrid() {
		
		boolean[][] grid = new boolean[numRows][numColumns];
		return grid;
	}
    
	public boolean[][] getBombGrids() {
		
		return this.bombGrid;
	}

	public int[][] getCountGrid() {
		int[][] grid = new int[numRows][numColumns];
		return grid;
	}
	
	public int[][] getCountGrids() {
		
		return this.countGrid;
	}
	
	public boolean isBombAtLocation(int row, int col) {
		
		return this.bombGrid[row][col] ;
	}
	
	public int getCountAtLocation(int row, int column) {
		int bombs = 0;
		
	//if(row+1 < numRows && row-1 > 0 && column+1 < numColumns && column-1 > 0) {  
		
		if(this.isBombAtLocation(row, column) == true) bombs++;
		
		if(row + 1 < numRows) {
		    if(this.isBombAtLocation(row+1, column) == true)bombs++;
		    if (column+1 < numColumns) {
			if(this.isBombAtLocation(row+1, column+1)== true)bombs++;
		    }
		    if(column - 1 >= 0) {
			if (this.isBombAtLocation(row+1, column-1)== true)bombs++;
		    }
		    }
		
		if(row - 1 >= 0) {
			if (this.isBombAtLocation(row-1, column)== true)bombs++;
			if(column - 1 >= 0) {
				if (this.isBombAtLocation(row-1, column-1)== true)bombs++;
			}
			if (column+1 < numColumns) {
				if (this.isBombAtLocation(row-1, column+1)== true)bombs++;
			}
			}
		
		if (column+1 < numColumns) {
			if (this.isBombAtLocation(row, column+1)== true)bombs++;
		}
		
		if(column - 1 >= 0) {
			if (this.isBombAtLocation(row, column-1)== true)bombs++;
		}
		
		return bombs;
	}
	
	private void createBombGrid() {
		Random rand = new Random();
		
		for (int i =0; i< numBombs; i++) {
			while(true) {
			int row = rand.nextInt(numRows);
			int col = rand.nextInt(numColumns);
			
			if(bombGrid[row][col] == false) { 
				bombGrid [row][col] = true;
				break;
			}
		  }
			
		}
	}
	
    public void createCountGrid() {
    	
		for(int i=0; i < numRows; i++) {
			for(int j=0; j < numColumns; j++) {
				
				countGrid[i][j] = this.getCountAtLocation(i, j);
			}
		}
	}
    
    public void print() {
    	for(int i=0; i < numRows; i++) {
			for(int j=0; j < numColumns; j++) {
				System.out.print(countGrid[i][j] );
				
			}
			System.out.println();
		}
    }
    
    public void printb() {
    	for(int i=0; i < numRows; i++) {
			for(int j=0; j < numColumns; j++) {
				System.out.print(bombGrid[i][j] );
				
			}
			System.out.println();
		}
    }

}

