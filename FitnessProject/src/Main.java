import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.println("Welcome to Fitness");

String FitnessProgram = "Planned Fitness \n"
						+"Burpee\n"
						+"Pushup\n"
						+"Situp\n"
						+"Squat";

System.out.println(FitnessProgram);

System.out.println("create your fitness.");

System.out.print("Burpee Number: ");
int burpee = scanner.nextInt();

System.out.print("Pushup Number: ");
int pushup = scanner.nextInt();

System.out.print("Situp Number: ");
int situp = scanner.nextInt();

System.out.print("Squat Number: ");
int squat = scanner.nextInt();

scanner.nextLine();

Fitness fitness = new Fitness (burpee, pushup, situp, squat);

System.out.println("Fitness is starting");

while (FitnessFinish() == false ) {
	
	System.out.print("Type of Movement (Burpee, Pushup, Situp, Squat): ");
	
	String tur = scanner.nextLine();	
	System.out.print("How many times:  ");
	
	int number = scanner.nextInt();
	scanner.nextLine();
	fitness.doYourMove(tur, number);
	
	
}

System.out.println("You finished your Fitness");

	}

	private static boolean FitnessFinish() {
		// TODO Auto-generated method stub
		return false;
	}

}
