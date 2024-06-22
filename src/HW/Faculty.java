//package HW;

import java.util.Arrays;

public class Faculty extends Employee {
	
	private Course[] coursesTaught;
	private int numCoursesTaught;
	private boolean isTenured;
	
	public Faculty() {
		super();
		this.coursesTaught = new Course[100];
		this.numCoursesTaught = 0;
		this.isTenured = false;
	}
	
	public Faculty(boolean isTenured) {
		super();
		this.coursesTaught = new Course[100];
		this.numCoursesTaught = 0;
		this.isTenured = isTenured;
	}
	
	public Faculty(String deptName, boolean isTenured) {
		super(deptName);
		this.isTenured = isTenured;
		this.coursesTaught = new Course[100];
		this.numCoursesTaught = 0;
	}
	
	public Faculty(String name, int birthYear, String deptName, boolean isTenured) {
		super(name, birthYear,deptName);
		this.isTenured = isTenured;
		this.coursesTaught = new Course[100];
		this.numCoursesTaught = 0;
	}
	
	public boolean isTenured() {
		return isTenured;
	}
	
	public int getNumCoursesTaught() {
		return this.numCoursesTaught;
	}
	
	public void setIsTenured(boolean isTenured) {
		this.isTenured = isTenured;
	}
	
	public void addCourseTaught(Course course) {
		if(this.numCoursesTaught < 100 && course != null) {
		this.coursesTaught[this.numCoursesTaught] = course;
		this.numCoursesTaught+= 1;
		}
	}
	
    public void addCoursesTaught(Course []course) {
    	if(numCoursesTaught < 100 && course != null) {
		for(int i=0; i < course.length; i++) {
			this.coursesTaught[this.numCoursesTaught] = course[i];
			this.numCoursesTaught +=1;
			if(this.numCoursesTaught >= 100) break;
			}
			
		}
	}
    
    public  Course getCourseTaught(int index) {
    	if(index >= 0 && index < this.numCoursesTaught ) {
    	return this.coursesTaught[index];
    	}
    	else return null;
    }
    
    public String getCourseTaughtAsString(int index) {
    	if(index >= 0 && index <= this.numCoursesTaught ) 
        	return this.coursesTaught[index].getCourseDept() + "-" + this.coursesTaught[index].getCourseNum();
        	else return "";
    }
    
    public String getAllCoursesTaughtAsString() {
    	String s="";
		for(int i =0 ; i<numCoursesTaught ; i++)
		{
			if(i != numCoursesTaught -1)                      
			    s += getCourseTaughtAsString(i) +",";
			else
				s += getCourseTaughtAsString(i);           
		}
		return s;
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Faculty other = (Faculty) obj;
		return Arrays.equals(coursesTaught, other.coursesTaught) && isTenured == other.isTenured
				&& numCoursesTaught == other.numCoursesTaught;
	}
	
	
	@Override
	public String toString() {
		String Tenured = "";
		if(this.isTenured == true) Tenured = "Is Tenured";
		else Tenured = "Not Tenured";
		   String s = String.format(" Faculty: %11s | Number of Courses Taught: %3d | Courses Taught: %s",Tenured, this.numCoursesTaught, getAllCoursesTaughtAsString() );
		   return super.toString() + s;
		   }
	
	
    
}
