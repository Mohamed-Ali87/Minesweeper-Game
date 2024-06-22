package HW;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

Course[] courses = new Course[3];
		System.out.println("Welcome to the School database");
		System.out.println("Select first course: ");
		boolean a = false;
		String graduate = kb.next();
		if (graduate.equals("graduate")) a= true;
		else if (graduate.equals("undergraduate")) a=false;
		int courseNum = kb.nextInt();
		String courseName = kb.next();
		int courseCredits = kb.nextInt();
		                                                         //graduate, course number, course name, credits
		System.out.println("Select second course: ");
		boolean b = false;
		String graduate1 = kb.next();
		if (graduate1.equals("graduate")) b= true;
		else if (graduate1.equals("undergraduate")) b=false;
		int courseNum1 = kb.nextInt();
		String courseName1 = kb.next();
		int courseCredits1 = kb.nextInt();
		
		System.out.println("Select third course: ");
		boolean c = false;
		String graduate2 = kb.next();
		if (graduate2.equals("graduate")) c= true;
		else if (graduate2.equals("undergraduate")) c=false;
		int courseNum2 = kb.nextInt();
		String courseName2 = kb.next();
		int courseCredits2 = kb.nextInt();
		
		courses[0] = new Course(a,courseNum,courseName,courseCredits);
		courses[1] = new Course(b,courseNum1,courseName1,courseCredits1);
		courses[2] = new Course(c,courseNum2,courseName2,courseCredits2);
		
		System.out.print("COURSES CHOOSEN\n");
		for(int i=0; i<courses.length; i++) {
			System.out.println(courses[i].toString());
		}
		System.out.println("********************************");
		
		
Faculty[] fac = new Faculty[3];
		
		System.out.println("Choose first Faculty: ");
		boolean d = false;
		String tenured = kb.next();
		if (tenured.equals("tenured")) d= true;
		else if (tenured.equals("not_tenured")) d=false;
		String facultyName = kb.next();
		int facultyBirthYear = kb.nextInt();
		String department = kb.next();
		
		System.out.println("Choose second Faculty: ");
		boolean e = false;
		String tenured1 = kb.next();
		if (tenured1.equals("tenured")) e= true;
		else if (tenured1.equals("not_tenured")) e=false;
		String facultyName1 = kb.next();
		int facultyBirthYear1 = kb.nextInt();
		String department1 = kb.next();
		
		System.out.println("Choose third Faculty: ");
		boolean f = false;
		String tenured2 = kb.next();
		if (tenured.equals("tenured")) f= true;
		else if (tenured2.equals("not_tenured")) f=false;
		String facultyName2 = kb.next();
		int facultyBirthYear2 = kb.nextInt();
		String department2 = kb.next();

		
		fac[0] = new Faculty(facultyName,facultyBirthYear,department,d);
		fac[1] = new Faculty(facultyName1,facultyBirthYear1,department1,e);
		fac[2] = new Faculty(facultyName,facultyBirthYear,department,f);
		
		System.out.println("Please add the first and second courses you selected to " + facultyName);
		int addedCourse1 = kb.nextInt();
		int addedCourse2 = kb.nextInt();
		
		if(addedCourse1 == 1 && addedCourse2 == 2) {
			fac[0].addCourseTaught(courses[0]);
			fac[0].addCourseTaught(courses[1]);
		}
		
		System.out.print("FACULTY CHOOSEN\n");
		for(int i=0; i<fac.length; i++) {
			System.out.println(fac[i].toString());
		}
		
		System.out.println("********************************\n");
		
       
		
GeneralStaff[] gen = new GeneralStaff[3];
		
		System.out.println("Choose first general staff member: ");
		
		String staffName = kb.next();
		int staffBirthYear = kb.nextInt();
		String staffDepartment = kb.next();
		String duty = kb.next();
		
        System.out.println("Choose second general staff member: ");
		
		String staffName1 = kb.next();
		int staffBirthYear1 = kb.nextInt();
		String staffDepartment1 = kb.next();
		String duty1 = kb.next();
		
        System.out.println("Choose third general staff member: ");
		
		String staffName2 = kb.next();
		int staffBirthYear2 = kb.nextInt();
		String staffDepartment2 = kb.next();
		String duty2 = kb.next();
		
		gen[0] = new GeneralStaff(staffName,staffBirthYear,staffDepartment,duty);
		gen[1] = new GeneralStaff(staffName1,staffBirthYear1,staffDepartment1,duty1);
		gen[2] = new GeneralStaff(staffName2,staffBirthYear2,staffDepartment2,duty2);
		
		for(int i=0; i<gen.length; i++) {
			System.out.println(gen[i].toString());
		}
		
		
		System.out.println("********************************\n");
		
Student[] s = new Student[3];
		
		System.out.println("Choose first student: ");
		boolean g = false;
		String studentGraduate = kb.next();
		if (studentGraduate.equals("graduate")) g= true;
		else if (studentGraduate.equals("undergraduate")) g=false;
		String studentName = kb.next();
		int studentBirthYear = kb.nextInt();
		String major = kb.next();
		
		System.out.println("Choose second student: ");
		boolean h = false;
		String studentGraduate1 = kb.next();
		if (studentGraduate1.equals("graduate")) h= true;
		else if (studentGraduate1.equals("undergraduate")) h=false;
		String studentName1 = kb.next();
		int studentBirthYear1 = kb.nextInt();
		String major1 = kb.next();
		
		System.out.println("Choose third student: ");
		boolean j = false;
		String studentGraduate2 = kb.next();
		if (studentGraduate2.equals("graduate")) j= true;
		else if (studentGraduate2.equals("undergraduate")) j=false;
		String studentName2 = kb.next();
		int studentBirthYear2 = kb.nextInt();
		String major2 = kb.next();
		
		s[0] = new Student(studentName,studentBirthYear,major,g);
		s[1] = new Student(studentName1,studentBirthYear1,major1,h);
		s[2] = new Student(studentName2,studentBirthYear2,major2,j);
		
		System.out.println("Please add the first and second courses you selected to " + studentName);
		int addedCourse3 = kb.nextInt();
		int addedCourse4 = kb.nextInt();
		
		if(addedCourse1 == 1 && addedCourse2 == 2) {
			s[0].addCourseTaken(courses[0]);
			s[1].addCourseTaken(courses[0]);
		}
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i].toString());
		}
			
			
			
			
			
			System.out.println();
			
			System.out.println("**************************************************************\n"
					+ "SCHOOL DATABASE INFO:\n"+ "\n" + "************************************************");
			
			System.out.println("COURSES:");
			
			for(int w=0; w<courses.length; w++) {
				System.out.println(courses[w].toString());
			}
			
			System.out.println();
			System.out.print("************************************************\n"
					+ "************************************************\n"
					+ "PERSONS:\n"
					+ "************************************************\n"
					+ "************************************************\n"
					+ "EMPLOYEES:\n"
					+ "************************************************\n"
					+ "************************************************\n"
					+ "GENERAL STAFF:\n");
			
			for(int l=0; l<gen.length; l++) {
				System.out.println(gen[l].toString());
			}
			
			System.out.print("************************************************\n"
					+ "************************************************\n"
					+ "FACULTY:\n");
			
			for(int l=0; l<fac.length; l++) {
				System.out.println(fac[l].toString());
			}
			
			System.out.print("************************************************\n"
					+ "************************************************\n"
					+ "STUDENTS:\n");
			
			for(int l=0; l<s.length; l++) {
				System.out.println(s[l].toString());
			}
			
			System.out.print("************************************************\n"
					+ "**************************************************************\n\n");
		
	}
} 
