import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.print("Enter your word: ");
		Scanner scanner = new Scanner(System.in);
		String day = scanner.next();
		
		switch(day) {
		case "Sunday":
			System.out.println("It is Sunday!");
			break;
			
		case "Monday" :
			System.out.println("It is Monday");
			break;
			
		case "Tuesday":
			System.out.println("It is Tuesday");
			break;
			
			default : System.out.println("It is not a day");
		}

	}

}
