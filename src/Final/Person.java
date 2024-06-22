//package Final;

import java.util.Objects;

public class Person {
	
	private String name;
	private boolean hasDriverLicense;
	private int age;
	private int height;
	
	public Person(String name, boolean hasDriverLicense, int age, int height) {
		this.name = name;
		this.hasDriverLicense = hasDriverLicense;
		this.age = age;
		this.height = height;
	}
		
	public String getName() {
		return name;
	}
	
	public boolean hasDriverLicense() {
		return this.hasDriverLicense;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getHeight() {
		return height;
	}
	
	public Person clone() {
		Person clone = new Person(name, hasDriverLicense, age, height);
		return clone;
	} 
	
	@Override
	
	   public String toString() {
		String license;
		
		if(this.hasDriverLicense == true) license = "has license";
		else license = "no license";
		
		   String s = String.format("Person [name= %10s | age= %02d | height= %02d | %s]", name, age, height, license);
		   return s;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && hasDriverLicense == other.hasDriverLicense && height == other.height
				&& Objects.equals(name, other.name);
	}
	
	
}
