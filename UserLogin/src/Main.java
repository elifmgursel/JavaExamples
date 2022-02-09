import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int giris_hakki = 3;
		
		String sys_kullanici_adi = "Elif Murvet";
		String sys_parola = "12345";
		
		System.out.println(" Welcome!");
		
		while (true) {
		
		System.out.print("Kullanici adi: ");
		String Kullanıcı = scanner.nextLine();
		
		System.out.print("Parola: ");
		String Parola = scanner.nextLine();
		
		Parola.equals(sys_parola);
		
		if (Kullanıcı.equals(sys_kullanici_adi) && Parola.equals(sys_parola)) { 
			
			System.out.println("Hoşgeldiniz, " + Kullanıcı);
			break;
			
		}
		
		else if (Kullanıcı.equals(sys_kullanici_adi) && !Parola.equals(sys_parola)) {
			
			System.out.println("Parolanız yanlış!!");
			
			giris_hakki -=1;
			
			System.out.println("Giriş Hakkı : " +giris_hakki);
			
		}
		
		else if (!Kullanıcı.equals(sys_kullanici_adi) && Parola.equals(sys_parola)) {
			
			System.out.println("Kullanıcı adınız yanlıştır.. ");
			
			giris_hakki -=1;
			
			System.out.println("Giriş Hakkı : " +giris_hakki);
			
		}
		
		else {
			
			System.out.println("Kullanıcı adı ve Parolanız yanlış!!!");
			
			giris_hakki -=1;
			
			System.out.println("Giriş Hakkı : " +giris_hakki);
						
		}
		
		if (giris_hakki == 0 ) {
			
			System.out.println("Kartınız bloke olmuştur..");
			break;
			
		}
			
		}
		
		
				
	}

}
