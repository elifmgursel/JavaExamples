import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.println("Your are playing game. If you want to quit please enter q or Q to quit");
String response = scanner.next();


if (response.equals("q") || response.equals("Q")) {
	System.out.println("You quit the game");
	
}

else {
	System.out.println("You are still playing");
}

	}

}
