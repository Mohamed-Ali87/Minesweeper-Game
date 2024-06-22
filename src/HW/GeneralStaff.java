//package HW;

import java.util.Objects;

public class GeneralStaff extends Employee{
	
	private String duty;
	
	public GeneralStaff() {
		
		this.duty = "";
	}
	
	public GeneralStaff(String duty) {
		
		this.duty = duty;
	}

	
	public GeneralStaff(String deptName, String duty) {
		super(deptName);
		this.duty = duty;
	}
	
	public GeneralStaff(String name, int birthYear, String deptName, String duty) {
		super(name, birthYear, deptName);
		this.duty = duty;
	}
	
	public String getDuty() {
		return this.duty;
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		GeneralStaff other = (GeneralStaff) obj;
		return Objects.equals(duty, other.duty);
	}
	
	@Override
	public String toString() {
		   String s = String.format(" GeneralStaff: Duty: %10s",duty);
		   return super.toString() + s;
	}
	


}
