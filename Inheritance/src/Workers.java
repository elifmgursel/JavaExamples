
public class Workers { //Superclass or BaseClass

	private String name;
	private int salary;
	private String department;
	
	public Workers (String name, int salary, String department) {
	
	this.name = name;
	this.salary = salary;
	this.department = department;
	}
	
	public void work() {
		System.out.println("Workers are working.");
	}
	public void showInfromations() {
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
		System.out.println("Department: " + department);
	}
	public void changeDepartment(String newDepartment) {
		System.out.println("Department is changing");
		this.department = newDepartment;
		System.out.println("New department: " + this.department);
	}

}
