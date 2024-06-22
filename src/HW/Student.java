//package HW;

import java.util.Arrays;
import java.util.Objects;

public class Student extends Person  implements Comparable <Person>  {
	
	private static int numStudents=0;
	private int studentID;
	private Course[] coursesTaken;
	private int numCoursesTaken;
	private boolean isGraduate;
	private String major = "undeclared";
	
	public Student() {
		super();
		this.studentID = ++numStudents;
		this.coursesTaken = new Course[50];
		this.numCoursesTaken = 0;
		this.isGraduate = false;
	}
	
	public Student(boolean isGraduate) {
		super();
		this.isGraduate = isGraduate;
		this.studentID = ++numStudents;
		this.coursesTaken = new Course[50];
		this.numCoursesTaken = 0;
	}
	
	public Student(String major, boolean isGraduate) {
		super();
		this.major = major;
		this.isGraduate = isGraduate;
		this.studentID = ++numStudents;
		this.coursesTaken = new Course[50];
		this.numCoursesTaken = 0;
	}
	
	public Student(String name, int birthYear, String major, boolean isGraduate) {
		super(name, birthYear);
		this.major = major;
		this.isGraduate = isGraduate;
		this.studentID = ++numStudents;
		this.coursesTaken = new Course[50];
		this.numCoursesTaken = 0;
	}

	public static int getNumStudents() {
		return numStudents;
	}

	public int getStudentID() {
		return this.studentID;
	}

	public int getNumCoursesTaken() {
		return numCoursesTaken;
	}

	public boolean isGraduate() {
		return isGraduate;
	}

	public void setIsGraduate(boolean isGraduate) {
		this.isGraduate = isGraduate;
	}

	public String getMajor() {
		if (major == "") return "undeclared";
		else return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public void addCourseTaken(Course course) {
		
		if(this.numCoursesTaken < coursesTaken.length && course != null) {
		this.coursesTaken[this.numCoursesTaken] = course;
		this.numCoursesTaken+= 1;
		}
	}
	
    public void addCoursesTaken(Course []course) {
    	if(this.numCoursesTaken  < 50 && course != null) {
		for(int i=0; i < course.length; i++) {
			this.coursesTaken[this.numCoursesTaken] = course[i];
			this.numCoursesTaken+= 1;
			if(this.numCoursesTaken >= 50) break;
		}
		}
	}
    
    public  Course getCourseTaken(int index) {
    	if(index >= 0 && index < this.numCoursesTaken ) {
    	return this.coursesTaken[index];
    	}
    	else return null;
    }
    
    public String getCourseTakenAsString(int index) {
    	if(index >= 0 && index < this.numCoursesTaken ) 
        	return this.coursesTaken[index].getCourseDept() + "-" + this.coursesTaken[index].getCourseNum();
        	else return "";
    }
    
    public String getAllCoursesTakenAsString() {
    	String s="";
		for(int i =0 ; i<this.numCoursesTaken ; i++)
		{
			if(i != this.numCoursesTaken -1)                      
			    s += getCourseTakenAsString(i) +",";
			else
				s += getCourseTakenAsString(i);           
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
		Student other = (Student) obj;
		return Arrays.equals(coursesTaken, other.coursesTaken) && isGraduate == other.isGraduate
				&& Objects.equals(major, other.major) && numCoursesTaken == other.numCoursesTaken
				&& studentID == other.studentID;
	}
	
    @Override
	
	public String toString() {
		String graduate = "";
		if(this.isGraduate == true) graduate = "Graduate";
		else graduate = "Undergraduate";
		   String s = String.format(" Student: studentID: %04d | Major %20s | %14s | Number of Courses Taken: %3d | Courses Taken: %s",this.getStudentID(), this.getMajor(), graduate, numCoursesTaken,  getAllCoursesTakenAsString() );
		   return super.toString() + s;
		   }
    
    

}
