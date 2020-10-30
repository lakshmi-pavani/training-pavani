abstract class Interview {
    public abstract void apti();
	public abstract void gd();
	public abstract void tech();
	public abstract void hr();
}
 abstract class Day extends Interview {
    public void apti() {
	    System.out.println("aptitude is clear");
	}
	public void gd() {
	    System.out.println("group discussion is cleared");
	}
}
abstract class Day2 extends Day {
    public void tech() {
	    System.out.println("testing question");
	}
}
class Day3 extends Day2 {
	public void hr() {
	    System.out.println("joining date will be told");
	}
}
class Abstractinterview {
    public static void main(String args[]) {
	    Day3 d=new Day3();
		d.apti();
		d.gd();
		d.tech();
		d.hr();
	}
}