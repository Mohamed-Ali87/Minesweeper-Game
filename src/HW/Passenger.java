//package HW;

abstract public class Passenger implements Eater {
	
	private String name;
	private int birthYear;
	private double weight;
	private char gender;
	private int numCarryOn;
	private double height;
	
	public Passenger() {
		
		this.name ="";
		this.birthYear = 1900;
		this.weight = 0.0;
		this.height = 0.0;
		this.gender = 'u';
		this.numCarryOn = 0;
		
	}
	
	public Passenger(String name, int birthYear, double weight, double height, char gender, int numCarryOn) {
		this();
		this.name= name;
		
		this.birthYear = birthYear;
		
		if(weight < 0) { this.weight=-1;}
		else {this.weight = weight;}
		
		if(height < 0) { this.height=-1;}
		else {this.height = height;}
		
		if(gender == 'f' || gender == 'm' || gender == 'u') {this.gender = gender;}
		else {this.gender='u';}
		
		if(numCarryOn < 0) {this.numCarryOn = 0;}
    	else if (numCarryOn > 2) {this.numCarryOn = 2;}
    	else {this.numCarryOn = numCarryOn;}
	}
	
	public int calculateAge(int currentYear) {
		int age = currentYear - this.birthYear;
		if (currentYear < birthYear) {age = -1;}
		return age;
	}
	
	public void gainWeight() {
		this.weight++;
	}
	
	public void gainWeight(double bulk) {
		if(bulk > 0)
		this.weight = this.weight + bulk;
	}
	
	public int getBirthYear() {
		return this.birthYear;
	}
	
    public char getGender() {
		return this.gender;
	}

    public String getName() {
	return this.name;
    }

    public double getWeight() {
	return this.weight;
    }
    
    public double getHeight() {
    	return this.height;
    }

    public int getNumCarryOn() {
	return this.numCarryOn;
    }
    
    public boolean isFemale() {
    	if (this.gender == 'f') {
    		return true;
    	}
    	else {return false;}
    }
    
    public boolean isMale() {
    	if (this.gender == 'm') {
    		return true;
    	}
    	else {return false;}
    }
    
    public void loseWeight() {
    	if (this.weight >= 1)
    	this.weight= this.weight -1;
    }
    
    public void loseWeight(double drop) {
    	if (this.weight - drop >= 0) 
    	this.weight= this.weight - drop;
    }
    
    public void printDetails() {
    	System.out.printf("Name: %20s | Year of Birth: %4d | Weight: %10.2f |  Height: %10.2f | Gender: %c | NumCarryOn: %2d\n", this.name, this.birthYear, this.weight, this.gender, this.numCarryOn);
    }
    
    public void setGender(char gender) {
    	if(gender == 'f' || gender == 'm' || gender == 'u') {this.gender = gender;}
		else {this.gender='u';}
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setBirthYear(int birthYear) {
    	this.birthYear = birthYear;
    }
    
    public void setWeight(double weight) {
    	if(weight < 0) {this.weight = -1;}
    	else {this.weight = weight;}
    }
    
    public void setHeight(double height) {
    	if(height < 0) {this.height = -1;}
    	else {this.height = height;}
    }
    
    public void setnumCarryOn(int numCarryOn) {
    	if(numCarryOn < 0) {this.numCarryOn = 0;}
    	else if (numCarryOn > 2) {this.numCarryOn = 2;}
    	else {this.numCarryOn = numCarryOn;}
    }
    
    public double  calculateBMI() { 
    	double BMI;
    	BMI = (this.getWeight() * 703) / (this.getHeight() * this.getHeight());
    	return BMI;
    }
    
   @Override
   public String toString() {
	   String s = String.format("Name: %20s | Year of Birth: %4d | Weight: %10.2f |  Height: %10.2f | Gender: %c | NumCarryOn: %2d\n", this.name, this.birthYear, this.weight, this.height, this.gender, this.numCarryOn);
	   return s;
   }

   @Override
	public boolean equals(Object obj){
	   if (this == obj) {return true;}
	   if (obj ==null) {return false;}
		   
		   Passenger p =(Passenger)obj;
		   
		   return this.getBirthYear() == p.getBirthYear() && this.getGender() == p.getGender() && this.getName().equals(p.getName()) && this.getWeight() - p.getWeight() <= 0.5 && this.getHeight() - p.getHeight() <= 0.5;
	   
   }
   
    private int caloriesConsumed = 0;
	private int caloriesAccumulator = 0;
	
	
	public void setCaloriesConsumed(int caloriesConsumed) {
		this.caloriesConsumed = caloriesConsumed;
	}
	
   public void setCaloriesAccumulator(int caloriesAccumulator) {
		this.caloriesAccumulator= caloriesAccumulator;
	}
	
	public int getCaloriesConsumed() {
		return this.caloriesConsumed;
	}
	
	public int getCaloriesAccumulator() {
		return this.caloriesAccumulator;
	}
	
	public abstract double metabolizeAccumulatedCalories();
	
}
