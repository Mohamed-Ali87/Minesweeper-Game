//package HW;

public class Infant extends Person implements Mover {
	
	  class InfantToy{
		private String infantToyName;
		private int infantToyRating;
		
		public InfantToy(String infantToyName, int infantToyRating) {
			this.infantToyName = infantToyName;
			this.infantToyRating = infantToyRating;
		}
		
		public String toString() {
			String s = String.format("InfantToy: Toy Name: %20s | Rating %4d\n", this.infantToyName, this.infantToyRating);
			return s;
		}
	}

	private InfantToy[] toys;
	private int numInfantToys;
	
	public Infant() {
		super();
		toys = new InfantToy[9];
		numInfantToys = 0;
	}
	
	public Infant(java.lang.String name, int birthYear, double weight, double height, char gender, int numCarryOn) {
		super(name, birthYear, weight, height, gender, numCarryOn, 0);
		toys = new InfantToy[10];
		numInfantToys = 0;
	}
	
	public void addInfantToy(String name, int rating) {
		InfantToy toy = new InfantToy(name, rating);
		if (this.numInfantToys < 0 || this.numInfantToys > 10) System.out.print("toys has reached capacity of 10");
		
		else {
			toys[this.numInfantToys] = toy;
			numInfantToys++;
		}
	}
	
	public String getInfantToyAsString(int index) {
		if (index < 0 || index > this.numInfantToys) return "invalid index "+index;
		
		else return toys[index].toString();
	}
	
	public int getNumInfantToys() {
		return this.numInfantToys;
	}
	
	public String getInfantToyName(int index) {
		if (index < 0 || index > this.numInfantToys) return "invalid index "+index;
		
		else return toys[index].infantToyName;
	}
	
	public int getInfantToyRating(int index) {
		if (index < 0 || index > this.numInfantToys) return -1;
		
		else return toys[index].infantToyRating;
	}
	
	public int getHighestInfantToyRating() {
		int max = 0;
		for(int i=1; i <= toys.length-1; i++) {
			
			if(max < toys[i].infantToyRating) {
				max = toys[i].infantToyRating;
			}
		}
		return max;
	}
	
	
/*	@Override
	public void printDetails() {
		super.printDetails();
		System.out.printf("Infant: Number of Toys: %4d | Infant Toys:\n | InfantToy: Toy Name: %20s | Rating %4d\n", numInfantToys, toys, infantToyName, infantToyRating);
	}
	
	@Override
	public String toString() {
		String s = String.format()
	}*/
	
	@Override
	public String move() {
		return "flail arms and legs";
	}

	@Override
	public String move(int count) {
		if(count <= 0) return "";
		String s = "";
		for(int i=0; i < count; i++) {
			 s.concat("flail arms and legs");
		}
		return s;
	}

	@Override
	public void eat(Food food) {
	   int foodCalories = food.getCalories();
	   int caloriesConsumed = this.getCaloriesConsumed();
	   this.setCaloriesConsumed(caloriesConsumed + foodCalories);
	   int calsAccumulated = this.getCaloriesAccumulator();
	   this.setCaloriesAccumulator(calsAccumulated + foodCalories);
	}

	@Override
	public void eat(Food[] food) {
	    int addedCalories = 0;
	    for (Food f : food) {
	    addedCalories +=  f.getCalories();
	}
	    int caloriesConsumed = this.getCaloriesConsumed();
	    this.setCaloriesConsumed(caloriesConsumed + addedCalories);
	    int caloriesAccumulated = this.getCaloriesAccumulator();
	    this.setCaloriesAccumulator(caloriesAccumulated + addedCalories);
	}

	@Override
	public double metabolizeAccumulatedCalories() {
	    double weightGain = 0;
	    int cals = this.getCaloriesAccumulator();
	    while (cals - 1200 >= 0) {
	    weightGain++;
	    this.gainWeight();
    	cals = cals - 1200;
 	}
	
	    if (cals < 1200) {
    	double frac = cals / 1200.00;
	    this.gainWeight(frac);
	}
    	this.setCaloriesAccumulator(0);
    	return weightGain;
	}
	
}
