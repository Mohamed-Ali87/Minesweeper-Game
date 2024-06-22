import java.util.Objects;

//package HW;

public class Pediatrician extends Doctor {
	
	private boolean hasPrivatePractice = false;
	private String hospitalName = "";
	
	public Pediatrician(String name) {
		super(name);
		this.hospitalName = "";
	}
	
	public Pediatrician(String name, boolean hasPrivatePractice, String hospitalName) {
		super(name);
		this.hasPrivatePractice = hasPrivatePractice;
		this.hospitalName = hospitalName;
	}
	
	public boolean hasPrivatePractice(){
		return this.hasPrivatePractice;
	}
	
	public String getHospitalName() {
		return this.hospitalName;
	}
	
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	
	@Override
	public void addPatient(Patient pat) throws PatientException{
		int numPatients = this.getNumberOfPatients();
		if (pat != null && pat.getBirthYear() >= 18) super.addPatient(pat);
			
		else throw new PatientException();
		}
	
	
	@Override
	public String toString() {
		String s = String.format("\nPediatrician: %s | hospital name=%15s", hasPrivatePractice ? "has private practice" : "does not have private practice", hospitalName  );
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
		Pediatrician other = (Pediatrician) obj;
		return hasPrivatePractice == other.hasPrivatePractice && Objects.equals(hospitalName, other.hospitalName);
	}
	
	

}
