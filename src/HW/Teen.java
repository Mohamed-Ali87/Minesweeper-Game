//package HW;

public class Teen extends Person implements Mover {
	
	
	@Override
	public String move() {
		return "run fast and jump";
	}

	@Override
	public String move(int count) {
		if(count <= 0) return "";
		String s = "";
		for(int i=0; i < count; i++) {
			 s.concat("run fast and jump");
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
	    while (cals - 5000 >= 0) {
	    weightGain++;
	    this.gainWeight();
    	cals = cals - 5000;
 	}
	
	    if (cals < 5000) {
    	double frac = cals / 5000.00;
	    this.gainWeight(frac);
	}
    	this.setCaloriesAccumulator(0);
    	return weightGain;
	}
}
