
public class Test {

	public static void main(String[] args) {
		
		/* AccountData account1 = new AccountData(); // obje oluşturmak
		
		account1.setHesapNo("1123456");
		account1.setBakiye(500000.0);
		account1.setIsim("Elif");
		account1.setEmail("gurselelif@gmail.com");
		account1.setTelefon("1451231311");
		
		System.out.println("Bakiye: " +account1.getBakiye());
		*/
		
		AccountData account2 = new AccountData("65415153", 4000.0, "Elf", ".gmail.com", "65153615");
			
		account2.paraYatir(500);
		account2.paraCekme(2000);
		
	}
}
