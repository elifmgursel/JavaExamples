import java.util.Scanner;

public class ATM {

	public void calis(Hesap hesap) {
		
		Login login = new Login();
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Bankaya hosgeldiniz");
		
		System.out.println("*************************");
		System.out.println("Kullanici Giris");
		System.out.println("*************************");
		
		int giris_hakki =3;
		
		while (true) {
			
			if (login.login(hesap)) {
				
				System.out.println("Giris basarili");
				break;
								
			}
			
			else {
				
				System.out.println("Giris basarisiz");
				giris_hakki -=1;
				System.out.println("kalan hak:" +giris_hakki);
			}
			
			if (giris_hakki == 0 ) {
				
				System.out.println("giris hakkin bitti");
				return;
			}
		}
		
		System.out.println("*******************");
		String islemler ="1. Bakiye \n"
						+"2. Para Yatirma\n"
						+"3. Para Cekme\n"
						+"Cikis icin q";
		
		System.out.println(islemler);
		System.out.println("********************");
		
		
		while (true) {
			
			System.out.println("Islem secin: ");
			String islem = scanner.nextLine();
			
			if (islem.equals("q")) {
				
				break;
				
			}
		
			else if (islem.equals("1")) {
				
				System.out.println("Guncel bakiyeniz: " +hesap.getBakiye());
			}
			
			else if (islem.equals("2")) {
				
				System.out.println("Yatirmak istedigin tutar: ");
				int tutar = scanner.nextInt();
				scanner.nextLine();
				hesap.paraYatir(tutar);
				
			}
			
			else if (islem.equals("3")) {
				
				System.out.println("Cekmek istedigin tutar: ");
				int tutar = scanner.nextInt();
				scanner.nextLine();
				hesap.paraCekme(tutar);
			}
			
			else { 
				System.out.println("Gecersiz islem!");
			}
		}
		
		
		
		
		
		
		
	}
	
}
