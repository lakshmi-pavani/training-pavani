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
class Varible {
    public static void main(String args[]) {
        Student rahul = new Student();
        rahul.id = 1023;
        rahul.percentage = 76.5f;
        Student.clg = "Trk";
        System.out.println(".........................student details................................");
        System.out.println("student id = " +rahul.id);
        System.out.println("percentage = " +rahul.percentage);
        System.out.println("college = " +Student.clg);
        Student shiva=new Student();
        System.out.println("student id = " +shiva.id);//it takes default value
        System.out.println("percentage=" +shiva.percentage);//it takes default value
        System.out.println("college=" +Student.clg);

        Employee sai=new Employee();
        sai.employee_id=2023;
        sai.salary=10000;
        Employee.company_name="JNIT";
        System.out.println("....................................employee details...............................");
        System.out.println("employee id=" +sai.employee_id);
        System.out.println("employee salary=" +sai.salary);
        System.out.println(Employee.company_name);
}
}

