package assignment;
class Customer {
	int amount=10000;
	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw....");
		if(this.amount<amount) {
			System.out.println("less balance go and deposit");
			try {
				wait();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		this.amount-=amount;
		System.out.println("withdraw completed");
	}
	synchronized void deposite(int amount) {
		System.out.println("going to deposite");
		this.amount+=amount;
		System.out.println("deposite done");
		notify();
	}
}
class Test {

	public static void main(String[] args) {
		Customer rahul=new Customer();
			new Thread() {
				public void run() {
					rahul.withdraw(15000);
				}
			}.start();
			new Thread() {
				public void run() {
					rahul.deposite(20000);
				}
			}.start();
		}

	}

