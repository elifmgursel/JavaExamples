public class StringRepeatedWordCount {

	public static void main(String[] args) {

		String sentence = "Welcome to Java Session Session Session";
		
		String [] words = sentence.split(" ");
		
		/*Set <String> words2 = new HashSet<>(Arrays.asList(words));
		
		Vector <String> words3 = new Vector<>(Arrays.asList(words));
		
		List <String> words4 = new ArrayList<>(Arrays.asList(words));
		
		System.out.println(words.toString());
		System.out.println(words4.size());
		
		*/
		
		int wordCount = 1;
		
		for ( int i = 0; i<words.length; i++) {
			
			for ( int  j = i+1; j<words.length; j++) {
				
			
				if ( words[i].equals(words[j])) {
					
					wordCount +=1;
					words[j] ="0";
					
				}
				
			}
			
			if ( words[i] != "0") {
				
				System.out.println(words[i] + "=" + wordCount);
				
				wordCount=1; 
			}
		}
	

	}

}
