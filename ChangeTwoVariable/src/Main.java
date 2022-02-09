import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int first_number;
		int second_number;
		
		System.out.print("Please enter your first number : ");
		first_number = scanner.nextInt();
		
		System.out.print("Please enter your second number : ");
		second_number = scanner.nextInt();
		
		System.out.println("Before change numbers are : " );
		System.out.println("First number : " +first_number);
		System.out.println("Second number : "+second_number);
		
		int temp = first_number;
		
		first_number = second_number;
		
		second_number = temp;
		
		System.out.println("After change numbers are : ");
		System.out.println("First_number :" +first_number);
		System.out.println("Second_number : " +second_number);
		

	}

}
