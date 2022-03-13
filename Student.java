package week3.day1;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student Name is : " + "PRITHIVEE");
	}
	
	public void studentDept() {
		System.out.println("Student Department is " + "M-Tech");
	}
	
	public void studentId() {
		System.out.println("Student Id is :" + "16102004");
	}
	
	public static void main(String[] args){
		Student stud = new Student();
		stud.collegeName();             
		stud.collegeCode();
		stud.collgeRank();
		
		stud.deptName();              
		
		stud.studentId();
		stud.studentName();          
		stud.studentDept();
		
	}

	
}
