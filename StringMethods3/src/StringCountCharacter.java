
public class StringCountCharacter {

	public static void main(String[] args) {

		String sentence = "President Macron will then travel to Berlin for talks with the German chancellor and Polish President Andrzej Duda";
		
		/*int countCharacters = 0;
		
		for ( int i = 0; i< sentence.length(); i++) {
			
			if ( sentence.charAt(i) != (' ') ) {
				
				countCharacters++;
				
				}
						
			}
		
		System.out.println("Total character of sentence: " + countCharacters);

*/
		System.out.println("Total character of sentece: " +sentence.length());
		
		System.out.println("Total character without space of sentence: " +sentence.replace(" ", "").length());
		
	}

}
