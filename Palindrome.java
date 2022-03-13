package week3.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "RADAR";
		String reverse = "";
		
		int strlength = str.length();  // finding the length for String str = 5
		for(int i = strlength-1;i>=0;--i) {
			reverse = reverse + str.charAt(i);
		}
		if(str.toLowerCase().equals(reverse.toLowerCase())){
			System.out.println(str + " : " + " is a Palindrome");
		}else {
			System.out.println(str + ":" + "is not a palindrome");
		}

	}

}
