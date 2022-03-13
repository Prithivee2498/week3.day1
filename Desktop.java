package week3.day1;

public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("This is an desktop");
	}
	
	
	public static void  main(String[] args){
		Desktop sp = new Desktop();
		sp.desktopSize();
		sp.computerModel();
	

}
}