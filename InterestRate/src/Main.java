import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Anapara değeri
		 * kaç yıl vadeli yatırmak ister
		 * her sene sonunda toplam para miktarı
		 * 
		 * faiz oranı = %6
		 */

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to our bank.. Current interest rate is %6");
				
		int main, date;
		
		System.out.print("Your main money : ");
		main = scanner.nextInt();
		
		System.out.println("How much years to pay ? ");
		date = scanner.nextInt();
		
		double total = main;
		
		double interestRate = 0.06;
		
		for ( int i = 1 ; i<=date ; i++) {
			
			total = ( total * interestRate) + total;
			
			System.out.println(i + ".yilin sonunda total money: " + (int) total);
			
		}
		
		
	}

}
