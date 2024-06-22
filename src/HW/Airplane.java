//package HW;

public class Airplane {
	
	private Passenger passengers[];
	private String airplaneName;
	private int numPassengers;
	
	public Airplane(){
		passengers = new Passenger[100];
		numPassengers = 0;
		airplaneName ="";
	}
	
	public Airplane(java.lang.String name){
		passengers = new Passenger[100];
		numPassengers = 0;
		airplaneName = name;
	}
	
	public Airplane(int length){
		if(length < 0) length = 0;
		passengers = new Passenger[length];
		numPassengers = 0;
		airplaneName ="";
	}
	
	public Airplane(java.lang.String name, int length){
		if(length < 0) {length = 0;}
		passengers = new Passenger[length];
		this.numPassengers = 0;
		this.airplaneName = name;
	}
	
	public void addPassenger(Passenger a) {
		if(numPassengers < passengers.length) {
			passengers[numPassengers] = a;
			numPassengers++;
		}
		else {
			passengers[numPassengers] = a;
			numPassengers++;
			}
	}
	
	public java.lang.String getAirplaneName() {
		return this.airplaneName;
	}
	
	public Passenger getPassenger(int x) {
		if(x <0) {return null;}
		return this.passengers[x];
	}
	
	public int getNumPassengers() {
		return this.numPassengers;
	}
	
	public Passenger getFirstPassenger() {
		if(passengers[0] != null) {
		return passengers[0];}
		else {return null;}
	}
    
	public Passenger getLastPassenger() {
		return passengers[numPassengers -1];
	}
    
	public Passenger[] getPassengers() {
		return this.passengers;
	}
	
	public void setAirplaneName(java.lang.String name) {
		this.airplaneName = name;
	}
	
	public void printAllDetails() {
		System.out.printf("AirplaneName: %20s | Number of Passengers: %4d | Airplane Size: %4d\nName: %20s | Year of Birth: %4d | Weight: %10.2f | Gender: %c\n");
	}
	
	public Passenger removePassenger(int index) {
		if(index<0 || index>=numPassengers)return null;
		Passenger passenger = passengers[index];
		numPassengers--;
		for(int i=index;i<numPassengers;i++) {
		passengers[i] = passengers[i + 1];
		}
		return passenger;
	}
	
	public void removeAllPassengers() {
		numPassengers =0;
		passengers = new Passenger[passengers.length-1];
	}
	
	public double getTotalWeightOfAllPassengers() {
		double sum=0;
		for(int i=0;i<numPassengers;i++) {
		sum += passengers[i].getWeight();
		}
		return sum;
	}
	
    public double getAverageWeightOfAllPassengers() {
    	double sum=0;
		for(int i=0;i<numPassengers;i++) {
		sum += passengers[i].getWeight();
		}
		return sum/numPassengers;
	}
    
    public int getNumberOfPassengersAboveWeight(double number) {
     	int count=0;
    		for(int i=0;i<numPassengers;i++) {
    			if(passengers[i].getWeight() > number) count++;
    		}
    		return count;
   	}
    
    public int getNumberOfPassengersBelowWeight(double number) {
    	int count=0;
		for(int i=0;i<numPassengers;i++) {
			if(passengers[i].getWeight() < number) count++;
		}
		return count;
   	}
    
    public void increaseWeightOfAllPassengers() {
    	for(int i=0;i<numPassengers;i++) {
    		passengers[i].gainWeight();
    	}
    }
    
    public void increaseWeightOfAllPassengers(double weight) {
    	
    	for(int i=0;i<passengers.length-1;i++) {
    		passengers[i].gainWeight(weight);
    } 
  }
}
