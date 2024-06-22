//package HW;

public class Elder extends Person implements Mover {
	@Override
	public String move() {
		return "ouch my back wait for me";
	}

	@Override
	public String move(int count) {
		if(count <= 0) return "";
		String s = "";
		for(int i=0; i < count; i++) {
			 s.concat("ouch my back wait for me");
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
	    while (cals - 300 >= 0) {
	    weightGain++;
	    this.gainWeight();
    	cals = cals - 300;
 	}
	
	    if (cals < 300) {
    	double frac = cals / 300.00;
	    this.gainWeight(frac);
	}
    	this.setCaloriesAccumulator(0);
    	return weightGain;
	}

}
