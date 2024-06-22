//package HW;

import java.util.Objects;

public class Food {
	
	private String name;
	private int calories;
	
	public Food(String name, int calories) {
		this.name = name;
		this.calories = calories;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getCalories() {
		return this.calories;
	}

	@Override
	public String toString() {
		return String.format("Food - name: %10s | calories: %4d", this.name, this.calories);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		return calories == other.calories && Objects.equals(name, other.name);
	}
	
	

}
