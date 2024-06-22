//package Final;
import java.util.Objects;

public class Car extends Vehicle implements Comparable<Car>, Announcements {
	
	private int numDoors;
	private int numWindows;

	public Car(int numDoors, int numWindows) {
		super(2,2);
		this.numDoors = numDoors;
		this.numWindows = numWindows;
	}
	
	public Car(int numDoors, int numWindows, int numSeatsPerRow) {
		super(2,numSeatsPerRow);
		this.numDoors = numDoors;
		this.numWindows = numWindows;
	}
	
	public Car(int numDoors, int numWindows, int[] numSeatsPerRow) {
		super(numSeatsPerRow);
		this.numDoors = numDoors;
		this.numWindows = numWindows;
	}
	
	Car(int numDoors, int numWindows, Person driver, int [ ] numSeatsPerRow) {
		super(driver,numSeatsPerRow);
		this.numDoors = numDoors;
		this.numWindows = numWindows;
	}
	
	public boolean canOpenDoor(Person p) {
		if(numDoors >= 2 * this.numberOfRows){
			Person g = super.getPersonInSeat(0,super.getPeopleInRow(0).length-1);
			if(g!=null && g.getAge() > 5) return true;
			}
			return false;
	}
	
	public boolean canOpenWindow(Person p) {
		if(numWindows >= 2 * this.numberOfRows){
			Person g = super.getPersonInSeat(0,super.getPeopleInRow(0).length-1);
			if(g != null && g.getAge() > 2) return true;
		}
			return false;
	}
	
	public int getNumDoors() {
		return this.numDoors;
	}
	
	public int getNumWindows() {
		return this.numWindows;
	}
	
	//@Override
	
	 //  public String toString() {
		//   String s = String.format("Car: number of doors= %02d | number of windows = %02d | number of rows= %02d | seats per row= %s | names of people on board= %s\\n", this.numDoors, this.numWindows, this.numberOfRows, this.numSeatsPerRow, );
		  // return s;
	//}
	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return numDoors == other.numDoors && numWindows == other.numWindows;
	}

	@Override
	public String departure() {
		// TODO Auto-generated method stub
		return "All Aboard\n";
	}

	@Override
	public String arrival() {
		// TODO Auto-generated method stub
		return "Everyone Out\n";
	}

	@Override
	public String doNotDisturbTheDriver() {
		// TODO Auto-generated method stub
		return "No Backseat Driving\n";
	}

	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		return -1;
	}

	@Override
	public boolean loadPassenger(Person p) {
		if (this.getNumberOfAvailableSeats() > 0) {
		
			for(int i =0; i < this.numberOfRows; i++) {
				for(int j =0; j < this.personsOnBoard[i].length; j++) {
					if (this.personsOnBoard[i][j] == null) {
						this.personsOnBoard[i][j] = p;
						return true;
						}
					
					}
				}
			}
	          return false;
	}

	@Override
	public int loadPassengers(Person[] peeps) {
		int p=0;
		for(int i =0; i < this.numberOfRows; i++) {
			for(int j =0; j < this.personsOnBoard[i].length; j++) {
				if (this.personsOnBoard[i][j] == null) {
					this.personsOnBoard[i][j] = peeps[p++];
					}
				if (p == peeps.length)return p;
				}
			}
          return p;
	}
		
	

}
