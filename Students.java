package week3.day1;

public class Students {

	public void getStudentInfo() {
		System.out.println("");
		
	}
	
	public void getStudentInfo(int id) {
		System.out.println("Student id is :" + "123");
	} 
	
	public void getStudentInfo(String name,String email) {
		System.out.println("Student Name is :" + "PRITHIVEE" + "," + " Email Id is :" + "prithiveeraj@gmail.com");
		
	}
	
	public void getStudentInfo(long phonenumber) {
		System.out.println("Phone Number is : " + "9876543210L");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students sd = new Students();
		//sd.getStudentInfo();
		sd.getStudentInfo(1);
		sd.getStudentInfo("", "");
		sd.getStudentInfo(3L);
		

	}

}
