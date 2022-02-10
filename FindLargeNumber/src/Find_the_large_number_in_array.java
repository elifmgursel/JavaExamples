
public class Find_the_large_number_in_array {
	
	public static int getLarge(int[] array) {
		
		int max = array[0];
		
		for( int i = 0; i<array.length; i++) {
			
			if (array [i] > max ) {
				
				max = array [i];
				
			}
		}
		
		System.out.println("Max number is: " +max);
		return max;
	}
	

	public static void main(String[] args) {

		int a [] = {55,68,45,72,108};
		getLarge(a);
		

	}

}
