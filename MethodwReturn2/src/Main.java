
public class Main {
	
	public static int ikiilecarp (int a) {
		return a*2;
	}
	
	public static int ikiiletopla(int a) {
		
		return a + 2;
	}
	
	public static int dörtilecarp(int a) {
		return a *4; 
	}

	public static void main(String[] args) {
		

System.out.println("Sonuc: " + dörtilecarp(ikiiletopla(ikiilecarp(8))));


	}

}
