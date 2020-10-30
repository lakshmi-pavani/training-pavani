class Instagram {
    public void homepage() {
	    System.out.println("In instagram available posts option,like option,search option is available ");
	}
}
class Instagram1 extends Instagram {
    public void homepage() {
	    System.out.println("In instagram reels option available ");
	}
}
class Methodoverridinginstagram {
    public static void main(String args[]) {
	    Instagram i=new Instagram1();
		i.homepage();
	}
}