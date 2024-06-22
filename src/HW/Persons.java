package HW;
//package HW;

abstract public class Persons extends Passenger {

	private int numOffspring;
	
	public Person() {
		super();
		numOffspring = 0;
	}
	
	public Person(int numOffspring) {
		if (numOffspring < 0) {
			this.numOffspring = 0;
		}
		else {this.numOffspring = numOffspring;}	
		}
	
	public Person(java.lang.String name, int birthYear, double weight, double height, char gender, int numCarryOn, int numOffspring) {
		super(name, birthYear, weight, height, gender, numCarryOn);
		if (numOffspring < 0) {
			this.numOffspring = 0;
		}
		else {this.numOffspring = numOffspring;}
	}
	
	public void setNumOffspring(int numOffspring) {
		if (numOffspring < 0) {
			 this.numOffspring = 0;
		}
		else { this.numOffspring = numOffspring;}
	}
	
	public int getNumOffspring() {
		return this.numOffspring;
	}
	
	@Override
	public void printDetails() {
		System.out.printf("Name: %20s | Year of Birth: %4d | Weight: %10.2f | Height: %10.2f | Gender: %c | NumCarryOn: %2d\\n Person: Number of Offspring: %4d\\n",getName(), getBirthYear(), getWeight(), getGender(), getNumCarryOn(), this.numOffspring);
	}
	
	@Override
	public String toString() {
		String s = String.format("Name: %20s | Year of Birth: %4d | Weight: %10.2f | Height: %10.2f | Gender: %c | NumCarryOn: %2d\n",getName(), getBirthYear(), getWeight(), getGender(), getNumCarryOn(), this.numOffspring);
		return s;
	}
	@Override
	public boolean equals(Object obj){
		   if (this == obj) {return true;}
		   if (obj ==null) {return false;}
		   
		   Person p =(Person)obj;
		   return super.equals(obj) && this.numOffspring == p.numOffspring;
}
	}
