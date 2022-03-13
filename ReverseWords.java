package week3.day1;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester"; 
		System.out.println(test);
		
			String[] spilt_words = test.split("");
			for(int i=0;i<spilt_words.length;i++)
				
			 {
			if(i%2!=0)							
			 {			
				char[] name2 = spilt_words[i].toCharArray();		
				for(int j=name2.length-1;j>=0;j--) {
					System.out.print(name2[j]);
				}
				}
				else
			{
				System.out.print(" "+spilt_words[i]+" "); //0
			}
			}


	}

}
