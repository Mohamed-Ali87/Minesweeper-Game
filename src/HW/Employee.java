//package HW;

import java.util.Objects;

public class Employee extends Person {
	
	private String deptName;
	private static int numEmployees=0;
	private int employeeID;
	
	public Employee() {
		super();
		this.deptName = "";
		this.employeeID = ++numEmployees;
	}
	
	public Employee (String deptName) {
		super();
		this.deptName = deptName;
		this.employeeID = ++numEmployees;
	}
	
	public Employee(String name, int birthYear, String deptName) {
		super(name, birthYear);
		this.deptName = deptName;
		this.employeeID = ++numEmployees;
	}
	
	public String getDeptName() {
		return this.deptName;
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public static int getNumEmployees() {
		return numEmployees;
	}
	
	public int getEmployeeID() {
		return this.employeeID;
	}
	
	@Override
	   public String toString() {
		   String s = String.format(" Employee: Department: %20s | Employee Number: %3d", deptName, employeeID);
		   return super.toString() + s;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(deptName, other.deptName) && employeeID == other.employeeID;
	}
	
	

	
}
