class Restuarant {
    void takeOrder(String order) {
	    System.out.println("order given is " +order);
	}
	
	void takeOrder(String order1,String order2) {
	    System.out.println("order given is " +order1+ "and "+order2);
	}
	
	void takeOrder(String order1,String order2,String order3) {
	    System.out.println("order given is " +order1+ " and " +order2+ " " +order3);
	}
}
class Customer1 {
    public static void main(String args[]) {
	    Restuarant ohris = new Restuarant();
		ohris.takeOrder("Idly");
		ohris.takeOrder("Idly","dosa");
		ohris.takeOrder("Idly","dosa","pori");
	}
}