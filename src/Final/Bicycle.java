import java.util.Objects;

//package Final;

public class Bicycle extends Vehicle implements Comparable<Bicycle> {
	
	private double weight;
	
	public Bicycle(){
		super(1,1);
		this.weight = 0.0;
	}
	
	public Bicycle(Person driver) {
		super(driver, new int[1]);
		this.weight = 0.0;
	}
	
	public Bicycle(Person driver, double weight) {
		super(driver, new int[1]);
		if(weight < 0) this.weight = 0;
		this.weight = weight;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public void setWeight(double w) {
		if (w < 0) {this.weight = 0;}
		else this.weight = w;
	}
	
    @Override
	public void setDriver(Person p) throws InvalidDriverException {
		if (p.getAge() > 3) {
			//if (p.hasDriverLicense() == true) {
				this.personsOnBoard[0][0] = p;
		}
		else throw new InvalidDriverException();
		   
	}
    
    public String ToString() {
    	
    	return "Bicycle [ rider= " + getDriver().getName() + " | weight= " + weight + " ]";
    }

	@Override
	public boolean equals(Object obj) {
		Bicycle other = (Bicycle) obj ;

		double d = Math.abs( this.getWeight() - other.getWeight());

		if ( d <= 0.5 )return true;
		else return false;
	}
	
	@Override
	public int compareTo(Bicycle b) {
		double x;
		if (b == null) return 0;
		x= (this.weight - b.weight);  
		if(x < .5) return -1;
		if(x > .5)return 1;
		return 0;
	}

	@Override
	public boolean loadPassenger(Person p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int loadPassengers(Person[] peeps) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

}
