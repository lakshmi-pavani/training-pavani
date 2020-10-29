import java.util.*;
class Student {
    int id;
    float percentage;
    static String clg;
}
class Employee {
    int employee_id;
    int salary;
    static String company_name;
}
class Scannervarible {
    public static void main(String args[]) {
        Student rahul = new Student();
		Scanner sc=new Scanner(System.in);
        System.out.println(".........................student details................................");
        System.out.println("student id = " );
		rahul.id = sc.nextInt();
        System.out.println("percentage = " );
		 rahul.percentage = sc.nextFloat();
        System.out.println("college = ");
        Student.clg = sc.next();

        Employee sai=new Employee();
		Scanner sc1=new Scanner(System.in);
        System.out.println("....................................employee details...............................");
        System.out.println("employee id=" );
		 sai.employee_id=sc1.nextInt();
        System.out.println("employee salary=" );
		sai.salary=sc1.nextInt();
        System.out.println("comany name =");
		Employee.company_name=sc1.next();
}
}