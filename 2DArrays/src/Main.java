
public class Main {

	public static void main(String[] args) {
		
		/*
		 * String [][] cars= { {"camaro","corvette","silverado"}
								{"Mustang","Ford", "Peugeot"}
								{"Honda","FIAT", "Seat"}
								}
		
		*/
		String [][] cars = new String [3][3];
		
		cars [0] [0] = "Camaro";
		cars [0] [1] = "Corvette";
		cars [0] [2] = "Silverado";
		
		cars [1] [0] = "Mustang";
		cars [1] [1] = "Ford";
		cars [1] [2] = "Peugeot";
		
		cars [2] [0] = "Honda";
		cars [2] [1] = "FIAT";
		cars [2] [2] = "SEAT";
		
		for ( int i =0; i<cars.length; i++ ) {
			System.out.println();
			
			for( int j=0; j<cars[i].length; j++) {
				
				System.out.print(cars[i] [j] + " ");
			}
		}
	
	}

}
