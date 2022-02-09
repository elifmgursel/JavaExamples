import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int rows;
		int coloumns;
		String symbol ="";
		
		System.out.print("Enter number of rows : ");
		rows = scanner.nextInt();
		System.out.print("Enter number of colomuns : ");
		coloumns = scanner.nextInt();
		System.out.print("Enter your symbol : ");
		symbol = scanner.next();
		
		for ( int i = 1 ; i <= rows ; i++) {
			System.out.println();
			for(int j = 12 ; j <= coloumns ; j++) {
				System.out.print(symbol);
			}
		}

	}

}
