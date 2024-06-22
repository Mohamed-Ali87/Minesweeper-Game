//package HW;

import java.util.Objects;

public class Course implements Comparable <Course> {

	private boolean isGraduateCourse;
	private int courseNum;
	private String courseDept;
	private int numCredits;

	public Course(boolean isGraduateCourse, int courseNum, String courseDept, int numCredits) {
		this.isGraduateCourse = isGraduateCourse;
		this.courseNum = courseNum;
		this.courseDept = courseDept;
		this.numCredits = numCredits;
	}

	public boolean isGraduateCourse() {
		return isGraduateCourse;
	}

	public int getCourseNum() {
		return courseNum;
	}

	public String getCourseDept() {
		return courseDept;
	}

	public int getNumCredits() {
		return numCredits;
	}
	
	public String getCourseName() {
		if (this.isGraduateCourse == true) return "G" + courseDept + courseNum;
		else return "U" + courseDept + courseNum;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(courseDept, other.courseDept) && courseNum == other.courseNum
				&& isGraduateCourse == other.isGraduateCourse && numCredits == other.numCredits;
	}

	@Override
	   public String toString() {
		String graduate = "";
		if (this.isGraduateCourse == true) graduate = "Graduate";
		else graduate = "Undergraduate";
		   String s = String.format("Course: %3s-%3d | Number of Credits: %02d | %s", courseDept, courseNum, numCredits, graduate);
		   return s;
	}
	
	@Override
	public int compareTo(Course c) {
		if (c == null) return 0;
		if (this.courseNum > c.courseNum) return 1;
		else if (this.courseNum < c.courseNum) return -1;
		return 0;
	}
	
	

}
