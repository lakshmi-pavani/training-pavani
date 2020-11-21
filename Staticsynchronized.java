package assignment;
class Traning {
	public static synchronized void message(String companyName) {
		for(int i=0;i<10;i++) {
			System.out.println("welcome to the company");
			try {
				Thread.sleep(1000);
				System.out.println(companyName);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
class MyThread1 extends Thread {
	String companyName;
	MyThread1(String companyName){
		this.companyName=companyName;
	}
	public void run() {
		Traning.message(companyName);
	}
}
public class Staticsynchronized {

	public static void main(String[] args) {
		MyThread1 x=new MyThread1("motivity");
		MyThread1 y=new MyThread1("jnit");
		x.start();
		y.start();

	}

}
