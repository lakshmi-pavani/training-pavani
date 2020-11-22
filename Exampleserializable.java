package assignment;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Student implements Serializable {
	int id;
	String name;
	int marks;
	public Student(int id,String name,int marks) {
		super();
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public void Display()
    {
    	System.out.println("Id is :"+ this.id);
    	System.out.println(("Name is :"+this.name));
    	System.out.println("Marks are :"+this.marks);
    }
}
class Exampleserializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student rahul=new Student(1023,"rahul kumar",345);
		FileOutputStream fo=new FileOutputStream("E:\\Student.txt");
       ObjectOutputStream ot=new ObjectOutputStream(fo);
       ot.writeObject(rahul);
       //deserializable
       FileInputStream fi=new FileInputStream("E:\\Student.txt");
       ObjectInputStream oi=new ObjectInputStream(fi);
       Object o=oi.readObject();
       Student s=(Student)o;
       //System.out.println(s.id +" "+s.name+" "+s.marks);
       s.Display();
       //ot.flush();
       //ot.close();
       
	}

}
