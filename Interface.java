interface Rocket {
   void fly();
}
interface Car {
   void moveonground();
}
class Aeroplane implements Car,Rocket {
    public void fly(){
        System.out.println("flying in sky");
	}
	public void moveonground(){
	    System.out.println("moveon ground");
	}
}
class Interface {
    public static void main(String args[]){
	    Rocket r=new Aeroplane();
		r.fly();
	    Car c=new Aeroplane();
		c.moveonground();
	}
}
    	