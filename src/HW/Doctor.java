//package HW;

import java.util.Arrays;
import java.util.Objects;

public class Doctor implements SeesPatients, Comparable <Doctor>{
	
	private static int numDoctors = 0;
	private String name;
	private int licenseNumber;
	private Patient[] patients;
	private int numberOfPatients;
	
	
	
	Doctor(String name){
		numDoctors++;
		this.name = name;
		this.patients = new Patient[MAX_PATIENTS];
		this.numberOfPatients = 0;
		this.licenseNumber = numDoctors ;
	}
	
	public static int getNumDoctors() {
		return numDoctors;
	}
	
	public int getLicenseNumber() {
		return licenseNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumberOfPatients() {
		return numberOfPatients;
	}
	
	public String getPatientsAsString() {
		
		String s="";
		if(this.numberOfPatients >0) {
		for(int i =0 ; i<this.numberOfPatients-1 ; i++){
			s += patients[i].toString() + ", ";
		}
		 s = s +patients[49].toString();
		}
		return "patients= " + s ;
	}
	
	public void addPatient(Patient pat) throws PatientException{
		if(this.numberOfPatients < 100 && pat != null) {
			this.patients[this.numberOfPatients] = pat;
			this.numberOfPatients+= 1;
			}
		else throw new PatientException();
		
		
	}

	@Override
	public Patient[] getPatients() {
		return patients;
	}
    /*@Override
	public String getPatientsAsString() {
		String s="";
		for(int i =0 ; i<this.numberOfPatients ; i++){
			 s +=  patients[i].toString() + ", ";
		}
		return "patients= " + s;*/
		
		
//	 }

	@Override
	public boolean isPatient(Patient p) {
		if(p != null && this.numberOfPatients < 100) {
		for (int i =0; i < this.numberOfPatients; i++) {
			if(this.patients[i].equals(p)) return true;
			
		}
		}
		return false;
	}
	
	
	@Override
	public String toString() {
		String s = String.format("Doctor: name= %20s | license number= %06d | %s", name, licenseNumber, this.getPatientsAsString());
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
		Doctor other = (Doctor) obj;
		return licenseNumber == other.licenseNumber && Objects.equals(name, other.name)
				&& numberOfPatients == other.numberOfPatients && Arrays.equals(patients, other.patients);
	}

	@Override
	public int compareTo(Doctor d) {
		if (d == null) return 0;
		if (this.numberOfPatients > d.numberOfPatients) return 1;
		else if (this.numberOfPatients < d.numberOfPatients) return -1;
		return 0;
	}

}
