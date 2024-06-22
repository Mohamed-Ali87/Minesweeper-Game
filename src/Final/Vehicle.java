import java.util.ArrayList;

//package Final;

public abstract class Vehicle {
	
	
	protected Person [][] personsOnBoard;
	protected int numberOfRows;
	protected int maxSeatsPerRow;
	protected int[] numSeatsPerRow;
	
	public Vehicle(int numRows, int numSeatsPerRow) {
		numberOfRows = numRows;
		personsOnBoard = new Person[numberOfRows][numSeatsPerRow];
		//this.numSeatsPerRow = new int[numSeatsPerRow];
		
	}
	
	public Vehicle(int [ ] numSeatsPerRow) {
		this.numberOfRows = numSeatsPerRow.length;
		this.personsOnBoard = new Person [this.numberOfRows][];
		for(int i = 0; i < this.numberOfRows; i++) {
			personsOnBoard[i] = new Person [numSeatsPerRow[i]];
		}
		//this.numSeatsPerRow = numSeatsPerRow;
	}
	
	public Vehicle(Person driver, int [ ] numSeatsPerRow) {
		this.numberOfRows = numSeatsPerRow.length;
		this.personsOnBoard = new Person [this.numberOfRows][];
		for(int i = 0; i < this.numberOfRows; i++) {
			personsOnBoard[i] = new Person [numSeatsPerRow[i]];
		}
		if(driver.hasDriverLicense() == true) {
			this.personsOnBoard[0][0] = driver;
		}
	//	this.numSeatsPerRow = numSeatsPerRow;
		
	}
	
	public abstract boolean loadPassenger(Person p);
	
	public abstract int loadPassengers(Person [] peeps);
	
	
	public void setDriver(Person p) throws InvalidDriverException {
		if (p.hasDriverLicense() == true) {
			this.personsOnBoard[0][0] = p;
		}
		else throw new InvalidDriverException();
		   
	}
	
	
	
	public Person getDriver() {
		return personsOnBoard[0][0];
	}
	
	public boolean hasDriver() {
		
		if( this.personsOnBoard[0][0] == null) return false;
		else return true;
	}
	
	public int getNumberOfAvailableSeats() {
		int seatsAvailable = 0;
		for(int i =0; i < this.numberOfRows; i++) {
			for(int j =0; j < this.personsOnBoard[i].length; j++) {
				if(this.personsOnBoard[i][j] == null) { seatsAvailable++;}
			}
		}
		return seatsAvailable;
		
	}
	
	public int  getNumberOfAvailableSeatsInRow(int row) {
		if( row < 0 || row >= this.numberOfRows) return -1;
		
		int seatsAvailable = 0;
		
			for(int j =0; j < this.personsOnBoard[row].length; j++) {
				if(this.personsOnBoard[row][j] == null) seatsAvailable++;
			}
		
		return seatsAvailable;
		
	}
	
	public int getNumberOfPeopleOnBoard() {
		int count = 0;
		for(int i =0; i < this.numberOfRows; i++) {
			for(int j =0; j < this.personsOnBoard[i].length; j++) {
				if(this.personsOnBoard[i][j] != null) { count++;}
				}
			}
		return count;
	}
	
	public int getNumberOfPeopleInRow(int row) {
		if( row < 0 || row >= this.numberOfRows) return -1;
		
		int count = 0;
		for(int i=0; i < this.personsOnBoard[row].length; i++) {
			if (this.personsOnBoard[row][i] != null) count++;
		}
		return count;
	}
	
	public Person getPersonInSeat(int row, int col) {
		if(row < 0 || col < 0 || row >= numberOfRows || col >= this.personsOnBoard[row].length) {
			return null;
		}
		else return this.personsOnBoard[row][col];
	}
	
	public int[] getLocationOfPersonInVehicle(Person p) {
		int count = 0;
		int[] ar = {-1,-1};
		int[] array = new int[2];
		for(int i =0; i < this.numberOfRows; i++) {
			for(int j =0; j < this.personsOnBoard[i].length; j++) {
				if(this.personsOnBoard[i][j].equals(p)) {
					array[0]=i;
					array[1]=j;
					
					return array;
				}
				
				}
			}
		 
		return ar;
		
	}
	
	public Person[] getPeopleInRow(int r) {
		if( r < 0 || r >= this.numberOfRows) return null;
		
		ArrayList<Person> copy = new ArrayList<Person>();
		
		for(int i =0; i < this.personsOnBoard[r].length; i++) {
			Person p = personsOnBoard[r][i];
			if (p!=null)copy.add(p);
		}
			if (copy.size() == 0) return null;
			
			Person [] array = new Person [copy.size ()];
            for (int i = 0; i < copy.size(); i++) array[i] = copy.get(i);
   
            return array; 
	}
	
	public Person[][] getPeopleOnBoard(){
         Person [][] copy = new Person [numberOfRows][];
		
		for(int i =0; i < this.numberOfRows; i++) {
			copy[i] = new Person [this.personsOnBoard[i].length];
			for(int j =0; j < this.personsOnBoard[i].length; j++) {
				copy[i][j] = this.personsOnBoard[i][j];
					
				}
			}
		return copy;
	}
	
	public boolean isPersonInVehicle(Person p) {
		for(int i =0; i < this.numberOfRows; i++) {
			for(int j =0; j < this.personsOnBoard[i].length; j++) {
				if(this.personsOnBoard[i][j].equals(p)) {
					return true;
				}
					}
				}
	          return false;
	}
	
	public boolean  isPersonDriver(Person p) {
		if (this.personsOnBoard[0][0].equals(p) == true) {
			return true;
		}
		else return false;
	}

}
