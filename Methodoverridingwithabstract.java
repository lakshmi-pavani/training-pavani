abstract class Car {
    abstract void cost();
	abstract void milage();
	void start() {
	    System.out.println("starts with a key");
	}
}
class Audi extends Car {
    void cost() {
	    System.out.println("audi cost is 50lakhs");
	}
	void milage() {
	    System.out.println("audi milage is 10km");
	}
}
class Bmw extends Car{
    void cost() {
	    System.out.println("Bmw cost is 40lakhs");
	}
	void milage() {
	    System.out.println("Bmw milage is 10km");
	}
}
class Methodoverridingwithabstract {
    public static void main(String args[]) {
	     Car c=new Audi();
		 c.start();
		 c.cost();
		 c.milage();
		 
		 c=new Bmw();
		 c.cost();
		 c.milage();
	}
}