
public class CarData {
	private String color;
	private int doors;
	private int wheels;
	private String motor;
	private String model;

	public CarData() {
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		//this.doors = doors;
	if (doors<0) {
		
		System.out.println("doors must not under 0");
		
	}
	else {
		
		this.doors = doors;
		
	}
	
	
	}
	

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}