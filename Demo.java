package assignment;
class Traniees {
	public synchronized void message(String companyName) {
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
class MyThread extends Thread {
	Traniees c;
	String companyName;
	MyThread(Traniees c, String companyName){
		this.c=c;
		this.companyName=companyName;
	}
	public void run() {
		c.message(companyName);
	}
}

public class Demo {

	public static void main(String[] args) {
		Traniees t=new Traniees();
		MyThread x=new MyThread(t,"motivity");
		MyThread y=new MyThread(t,"jnit");
		x.start();
		y.start();

	}

}
