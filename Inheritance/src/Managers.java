
public class Managers extends Workers {

	private int responsiblePerson;
	
	
	public Managers(String name, int salary, String department, int responsiblePerson) {
		super(name, salary, department);
		
		this.responsiblePerson = responsiblePerson;
	} 

	public void increaseSalary(int rate) {
		
		System.out.println("Workers get " + rate + " dollar increase their salary");
	}
}
