//package HW;

import java.util.Objects;

public class Person implements Comparable <Person>  {
	
	private String name;
	private int birthYear;
	
	public Person() {
		this.name = "";
		this.birthYear = 0;
	}
	
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
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
		return birthYear == other.birthYear && Objects.equals(name, other.name);
	}
	
	@Override
	   public String toString() {
		   String s = String.format("Person: Name: %30s | Birth Year: %4d", name, birthYear);
		   return s;
	}

	@Override
	public int compareTo(Person p) {
		if (p == null) return 0;
		if (this.birthYear > p.birthYear) return 1;
		else if (this.birthYear < p.birthYear) return -1;
		else return 0;
	}

}
