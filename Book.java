class Book1{
    String bookname;
    int noofpages;
	String author;
	int chapters;
	
	Book1(String bookname,int noofpages,String author,int chapters) {
	    this.bookname = bookname;
	    this.noofpages = noofpages;
	    this.author = author;
	    this.chapters = chapters;
		this.display();
	}
	void display() {
	    System.out.println("name of the book is " +bookname);
	    System.out.println("number of pages in the book " +noofpages);
		System.out.println("author of the book " +author);
		System.out.println("how many chaters in the book "+chapters);
	}
}

class Book {
    public static void main(String args[]) {
	    Book1 b=new Book1("power of your mind",297,"Dr.joseph murphy",20);
	}
}
	