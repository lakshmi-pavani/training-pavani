class Day {
    public void apti() {
	    System.out.println("aptitude is clear");
	}
	public void gd() {
	    System.out.println("group discussion is cleared");
	}
}
class Day2 extends Day {
    public void programming() {
	    System.out.println("coding part is clear");
	}
}
class Day3 extends Day2 {
    public void technical() {
	    System.out.println("testing question");
	}
	public void hr() {
	    System.out.println("joining date will be told");
	}
}
class Multilevelinterview {
    public static void main(String args[]) {
	    Day3 d=new Day3();
		d.apti();
		d.gd();
		d.programming();
		d.technical();
		d.hr();
	}
}