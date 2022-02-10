
public class Animals {
	
	private String name;
	private int weight;
	private int height;
	private int legs;

	public Animals(String name, int weight, int height, int legs) {
		this.name = name;
		this.weight = weight;
		this.height =height;
		this.legs =legs;
		
	}
	public void eat() {
		
		System.out.println("Animal is eating something");
	}
	public void startMove(int velocity) {
		System.out.println("Animal is moving with" + velocity + " km/h");
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
}
