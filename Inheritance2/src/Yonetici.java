
public class Yonetici extends Calisan {

	private int responsiblePerson;
	
	
	public Yonetici(String name, int salary, String department, int responsiblePerson) {
		super(name, salary, department);
		
		this.responsiblePerson = responsiblePerson;
	} 

	public void increaseSalary(int rate) {
		
		System.out.println("Workers get " + rate + " dollar increase their salary");
	}
	
	public void showInformations() {
		System.out.println("Name: " + getName());
		System.out.println("Salary: " + getSalary());
		System.out.println("Department: " + getDepartment());
		
		System.out.println("Responsible person number: " + this.responsiblePerson);
	}
}

