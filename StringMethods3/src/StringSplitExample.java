
public class StringSplitExample {

	public static void main(String[] args) {

		String s = "Java String Split Example";
		
		String[] str1 = s.split(" ");
		
		/*for ( int i = 0 ; i < str1.length; i++) {
		
				System.out.println(str1[i]);
			}
		*/
		
		//System.out.print(str1.length);
		
		
		for ( String word : str1) {
			
			System.out.println(word);
			}
		
					
		}

	}


