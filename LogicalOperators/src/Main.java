import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

// && and operators both condition must be true
// || or operators either condition must be true
// ! not operators reverses boolean value of condition
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter temp");
		
		
		int temp = scanner.nextInt();
		
		if (temp>30) {
			System.out.println("Outside is hot!");
						
		}
		
		else if (temp>=20 && temp<=30) {
			System.out.println("It is normal");
		}
		
		else {
			System.out.println("It is cold!");
		}
	}

}
