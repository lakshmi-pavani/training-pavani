class Company {
    String name= "motivity labs";
    String jobrole = "software";
	double salary = 20000;
}

class Employee extends Company {
    String empname= "pavani";
	String emplocation="jeedimetla";
}

class Singleinheritance {
    public static void main(String args[]) {
	    Employee e=new Employee();
        System.out.println("employee name is " +e.empname);
		System.out.println("employee location " +e.emplocation);
		System.out.println("company name is " +e.name);
		System.out.println("jobe role " +e.jobrole);
		System.out.println("salary is " +e.salary);
	}
}
    