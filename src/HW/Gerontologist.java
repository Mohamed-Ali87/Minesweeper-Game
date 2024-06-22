//package HW;

import java.util.Objects;

public class Gerontologist extends Doctor{
	
	private boolean performsHouseCalls = true;
	private double visitFee = 0.0;
	
	public Gerontologist(String name) {
		super(name);
		this.performsHouseCalls = true;
		this.visitFee = 0.0;
	}
	
	public Gerontologist(String name, boolean performsHouseCalls, double visitFee ) {
		super(name);
		this.performsHouseCalls = performsHouseCalls;
		this.visitFee = visitFee;
	}
	
	public boolean performsHouseCalls() {
		return this.performsHouseCalls;
	}
	
	public double getVisitFee() {
		return this.visitFee;
	}
	
	public void setPerformsHouseCalls(boolean setPerformsHouseCalls) {
		this.performsHouseCalls = setPerformsHouseCalls;
	}
	
	public void setVisitFee(double visitFee) {
		if( visitFee >= 0)
		this.visitFee = visitFee;
	}
	
	@Override
	public void addPatient(Patient pat) throws PatientException{
		int numPatients = this.getNumberOfPatients();
		if (pat != null && pat.getBirthYear() > 65) super.addPatient(pat);
			
		else throw new PatientException();
		}
	
	
	public String toString() {
		String s = String.format("\nGerontologist: %s | visit fee=%02.2f", (performsHouseCalls ? "performs house calls" : "no house calls"), visitFee );
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
		Gerontologist other = (Gerontologist) obj;
		return performsHouseCalls == other.performsHouseCalls
				&& Double.doubleToLongBits(visitFee) == Double.doubleToLongBits(other.visitFee);
	}
	
	

}
