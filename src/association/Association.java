package association;



/* This example shows the Association relation between an Employee and its bank */
class Bank{
	private String name;
	 
	Bank(String name){
		this.name = name;
	}
	
	public String getBankName() {
		return this.name;
	}
}

class Employee{
	
	private String name;
	
	Employee(String name){
		this.name = name;
	}
	
	public String getEmployeename() {
		return this.name;
	}
}


	


public class Association {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank bank = new Bank("Axis");
		Employee emp = new Employee("Abdul");
		
		System.out.println(emp.getEmployeename() + " is employee of" + bank.getBankName());

	}

}
