class Google {
    void search(String data) {
	    System.out.println("searching string data for = "+data);
	}
	void search(int  data) {
	    System.out.println("searching int  data for = "+data);
	}
	void search(double data) {
	    System.out.println("searching double data for = "+data);
	}
}
class Googlesearch {
    public static void main(String args[]) {
	    Google g=new Google();
		g.search("college details");
		g.search(1234);
		g.search(27.56);
	}
}
