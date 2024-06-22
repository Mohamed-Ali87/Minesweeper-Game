package HW;

public class e extends Person {

	private String deptName;
	private static int numEmployees = 0;
	private int employeeID;

	public Employeee() {
	super("", 0);
	this.deptName = "";
	this.employeeID = ++numEmployees;
	}

	public Employeee(String deptName) {
	super("", 0);
	this.deptName = deptName;
	this.employeeID = ++numEmployees;
	}

	public Employeee(String name, int birthYear, String deptName) {
	super(name, birthYear);
	this.deptName = deptName;
	this.employeeID = ++numEmployees;
	}

	public String getDeptName() {
	return deptName;
	}

	public void setDeptName(String deptName) {
	this.deptName = deptName;
	}

	public static int getNumEmployees() {
	return numEmployees;
	}

	public int getEmployeeID() {
	return employeeID;
	}


	public boolean equals(Object obj) {
	Employee other = (Employee) obj;

	if(this.deptName != other.deptName)
	return false;
	if(this.employeeID != other.employeeID)
	return false;
	else
	return true;
	}

	public String toString() {
	return super.toString() + String.format(" Employee: Department: %20s | Employee Number: %3d", getDeptName(), getEmployeeID());
	}
	

}
