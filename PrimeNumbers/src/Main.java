
public class Main {

	public static boolean Prime (int num) {
		
		for (int i =2; i<num ; i++) {
			
			if (num % i ==0) {
				
			return false;
			
			}
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		for( int i=2; i<1000; i++) {
			
			if (Prime(i)) {
				
				System.out.println(i);
			}
		}

	}

}
