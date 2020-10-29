class Employee {
    int empid;
	String empname;
	int salary;
	
	Employee(int empid,String empname,int salary) {
	    this.empid=empid;
		this.empname=empname;
		this.salary=salary;
		this.display();
	}
	
	void display() {
	    System.out.println("employee id ="+empid);
		System.out.println("employee name =" +empname);
		System.out.println("employee salary =" +salary);
	}
}

class Constructor {
    public static void main(String args[]) {
	    Employee mahesh=new Employee(2021,"mahesh",45000);
		Employee siri=new Employee(2023,"siri",22000);
	}
}
		