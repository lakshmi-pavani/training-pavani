class Paymentapp {
    public void pay() {
	    System.out.println("money transaction");
	}
}
class Googlepay extends Paymentapp {
    public void gpay() {
	    System.out.println("google transaction");
	}
}
class Phonepay extends Paymentapp {
	public void ppay() {
    int a=25000;
	System.out.println("a="+a);
	}
}
class Paytm extends Paymentapp {
	public void pym() {
    int b=15000;
	System.out.println("b=" +b);
	}
}
class Hierarchicalpayments {
    public static void main(String args[]) {
	    Googlepay p=new Googlepay();
		System.out.println("...............googlepay..............");
		p.pay();
		p.gpay();
		Phonepay p2=new Phonepay();
		System.out.println("..............phonepay.............");
		p2.pay();
		p2.ppay();
		Paytm p3=new Paytm();
		System.out.println(".............paytm................");
		p3.pay();
		p3.pym();
	}
}
		
	 