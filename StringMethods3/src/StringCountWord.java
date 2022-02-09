
public class StringCountWord {

	public static void main(String[] args) {

		String sentence = "President Macron will then travel to Berlin for talks with the German chancellor and Polish President Andrzej Duda";
		
		/*int count = 1;
		
		for ( int i=0; i<sentence.length(); i++) {
			
			if (sentence.charAt(i) == ' ' ) {
				
				
				count++;
			}
			
				
		}
		System.out.println("Total number of words: " +count);

*/
		String [] words = sentence.split(" ");

			
		System.out.println(words.length);
		
		
	}

}
