abstract class Engineeringcertificate {
    public abstract void firstyearsubjects();
	public abstract void secondyearsubjects();
	public abstract void thirdyearsubjects();
	public abstract void fourthyearsubjects();
}
abstract class Firstyear extends Engineeringcertificate {
    public void firstyearsubjects() {
	    System.out.println("cleared all subjects");
	}
}
abstract class Secondyear extends Firstyear {
	public void secondyearsubjects() {
	    System.out.println("one backlog");
	}
}
abstract class Thirdyear extends Secondyear {
	public void thirdyearsubjects() {
	    System.out.println("cleared all subjects but backlogs not cleared");
	}
}
class Fourthyear extends Thirdyear {
	public void fourthyearsubjects(){
	    System.out.println(" finally cleared all subjects");
	}
}
class Abstract {
    public static void main(String args[]) {
	   Fourthyear f=new Fourthyear();
	   f.firstyearsubjects();
	   f.secondyearsubjects();
	   f.thirdyearsubjects();
	   f.fourthyearsubjects();
	}
}