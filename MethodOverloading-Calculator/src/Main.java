import java.util.Scanner;

public class Main {
	
	public static int minus(int a, int b) {
		
		return (a-b);
	}
	
	public static double bolme (int a, int b) {
		
		return ((double) a / b);
		
	}

	public static int toplama (int a, int b) {
	
		return (a+b);
	
	}
	
	public static int toplama (int a, int b, int c) {
		
		return (a+b+c);
		
	}
	
	public static int carpma (int a, int b) {
		
		return (a*b);
		
	}
	
	public static int carpma ( int a, int b, int c) {
		
		return (a*b*c);
				
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		String islemler ="1. Toplama islemi\n"
						+"2. Cıkarma İslemi\n"
						+"3. Carpma İslemi\n"
						+"4. Bolme İslemi\n"
						+"Cikis icin q'ya basin";
		
		System.out.println(islemler);
		
		while (true) {
			
			System.out.print("islemi secin: ");
			String islem = scanner.nextLine();
			
			if (islem.equals("q")) {
				System.out.println("programdan cikiliyor..");
				break;
								
			}
			
			else if (islem.equals("1")) {
				System.out.print("Kac deger toplayacaksiniz: ");

				int number = scanner.nextInt();
				
				if (number ==2 ) {
					
					System.out.print("a: ");
					int a = scanner.nextInt();
					
					System.out.print("b: ");
					int b = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Total: " + toplama(a,b));
				}
				
				else if (number ==3) {
					System.out.print("a: ");
					int a = scanner.nextInt();
					
					System.out.print("b: ");
					int b = scanner.nextInt();
					
					System.out.print("c: ");
					int c = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Total: " + toplama(a,b,c));
					
				}
				
				else {
					
					System.out.println("not suitable..");
				}
			}
			
			else if (islem.equals("2")) {
				
				System.out.print("a: ");
				int a = scanner.nextInt();
				
				System.out.print("b: ");
				int b = scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("Fark: " + minus(a,b));
			}
			
			else if (islem.equals("3")) {
				System.out.print("Kac deger carpacaksiniz: ");
				
				int number = scanner.nextInt();
				
				if (number ==2 ) {
					
					System.out.print("a: ");
					int a = scanner.nextInt();
					
					System.out.print("b: ");
					int b = scanner.nextInt();
					scanner.nextLine();
					System.out.println("carpim: " + carpma(a,b));
				}
				
				else if (number ==3) {
					
					System.out.print("a: ");
					int a = scanner.nextInt();
					
					System.out.print("b: ");
					int b = scanner.nextInt();
					
					System.out.print("c: ");
					int c = scanner.nextInt();
					scanner.nextLine();
					System.out.println("carpma: " + carpma(a,b,c));
					
				}
				
				else {
					
					System.out.println("not suitable..");
				}
				
			}
			
			else if (islem.equals("4")) {
				
				System.out.print("a: ");
				int a = scanner.nextInt();
				
				System.out.print("b: ");
				int b = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Bolme: " + bolme(a,b));
				
			}
			
		else {
				System.out.println("Gecersizzzz...");
			}
		}
		

	}

}
