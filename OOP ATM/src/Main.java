
public class Main {


	public static void main(String[] args) {
		// Login class kullanici girisini kontrol edecek
		
		//Hesap Class hesap islemlerini yapacak
		
		// ATM'de calistiricak

		ATM atm = new ATM();
		
		Hesap hesap = new Hesap ("Elif","12345", 5000);
		
		atm.calis(hesap);
				
		System.out.println("Programdan cikiliyor");
		
		
		
	}

}
