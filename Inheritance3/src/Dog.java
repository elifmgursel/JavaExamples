
public class Dog extends Animals {
	
	private int teethNumber;
	
	public Dog(String name, int weight, int height, int legs, int teethNumber) {
		
		super(name, weight, height, legs);
		
		this.teethNumber = teethNumber;	
	}
	public void run(int velocity) {
		System.out.println("Dog is running");
		startMove(velocity);
	}

	public int getTeethNumber() {
		return teethNumber;
	}

	public void setTeethNumber(int teethNumber) {
		this.teethNumber = teethNumber;
	}

}
