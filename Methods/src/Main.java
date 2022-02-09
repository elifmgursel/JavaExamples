import java.util.Scanner;

public class Main {
	
	/*public static void HelloPage() {
		
		System.out.println("Welcome to SINEC INS!");
		
	}

	public static void factorial() {
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("Please enter number: ");
		int number = scanner.nextInt();
		
		int factorial = 1;
		
		while (number >0) {
						
		factorial *= number;
		
		number --;
		
		}
		
		System.out.println("Factorial = " +factorial);
		
		*/
		
		public static void toplama (int a, int b, int c) {
			
			System.out.println("Total : " + (a+b+c)) ;
			
		
	}
		
	public static void main(String[] args) {
		/* Public: Erişim Belirleyici
		 * Static: Ekstra Özellikler (static,final)
		 * Void : Dönüş tipi (fonksiyondan gelen çıktı)
		 * Main : Fonksiyon adı (kendimiz belirleyebiliriz. daha sonra belirlediğimiz parametreleri gönderebiliriz)
		 * 
		 */
	
		toplama(3,4,5);
		
		toplama(10,12,20);
			
	
	}
	
		
	}
	
