import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * 1.islem : bakiye öğrenme
		 * 2. islem : para yatırma
		 * 3. islem : para çekme
		 * çıkış : q
		
		 
		 */

		Scanner scanner = new Scanner(System.in);
		
		int bakiye = 1000;
		String islemler = "1.islem : Bakiye öğrenme\n"
							+"2.islem : Para yatırma\n"
							+"3.islem : Para çekme\n"
							+"4.islem : Çıkış için q'ya basın";
		
		System.out.println(islemler);
		
		while (true) // kullanıcı q'ya basana kadar devam et demek istiyoruz 
			{
			System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
			String islem = scanner.nextLine();
			
			if(islem.equals("q")) {
				
				System.out.println("ATM'den çıkıyorsunuz.. ");
				break;
			}
			
			else if (islem.equals("1")) {
				
				System.out.println("Bakiyeniz: " +bakiye);
			}
			
			else if	(islem.equals("2")) {
				System.out.println("Yatırmak istediğiniz tutarı giriniz: " );
				int tutar = scanner.nextInt();
				scanner.nextLine();
				bakiye +=tutar;
				
				System.out.println("Yeni bakiyeniz : " +bakiye);				
				
			}
			
			else if (islem.equals("3")) {
				
				System.out.println("Çekmek istediğiniz tutarı giriniz : ");
				int tutar = scanner.nextInt();
				scanner.nextLine();	
				
				if ( bakiye - tutar > 0 ) {
				
					bakiye -= tutar;
					
					System.out.println("Yeni bakiyeniz: " +bakiye);
				}
				
								
				else {
					System.out.println("Yeterli bakiyeniz bulunmuyor.. Bakiye : " +bakiye);
									
				}
				
				
			}
			
			else { 
				System.out.println("Geçersiz işlem girdiniz.. ");
			}
			
			
}
					
				
	}

}
