package practice;

public class Main {
	public static void main(String[] args){
		Employee ref = new Employee();
		ref.display();
		displayMe();
		
	}
	private static void displayMe(){
		System.out.println("private method of main class is accessed");
	}

}
