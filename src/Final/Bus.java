//package Final;

public class Bus extends Car {
	
	public Bus(int[] numSeatsPerRow) {
		super(2,2*numSeatsPerRow.length-1,numSeatsPerRow);
	}
	
	public Bus(Person driver, int[] numSeatsPerRow) {
		super(2,2*numSeatsPerRow.length-1,driver,numSeatsPerRow);
	}
	
	@Override
	public String departure() {
		// TODO Auto-generated method stub
		return "All Aboard\nThe Bus\n";
	}

	@Override
	public String arrival() {
		// TODO Auto-generated method stub
		return "Everyone Out\nOf The Bus\n";
	}

	@Override
	public String doNotDisturbTheDriver() {
		// TODO Auto-generated method stub
		return "No Backseat Driving\nOn The Bus\n";
	}

}
