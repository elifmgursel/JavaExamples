import java.util.Scanner;

public class Main {

	public static int ebob ( int num1, int num2) {
		
		int ebob = 1;
		
		for (int i =1; i<=num1 && i<=num2; i++) {
			
			if ((num1 % i == 0) &&(num2 % i == 0)) {
				
				ebob = i;
				
			}
		}
		
		return ebob;
		
	}
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" Enter first number: ");
		int num_1 = scanner.nextInt();
		
		System.out.print(" Enter second number: ");
		int num_2 =scanner.nextInt();
		
		System.out.println("Both number ebob: " + ebob(num_1, num_2));	
		


	}

}
