class University {
    void listOfCollege() {
	    System.out.println(" Chaitanya bharathi institute of technology");
		System.out.println(" vasavi institute of technology ");
		System.out.println(" mallareddy institute of technology ");
		System.out.println(" Jawaharlal Nehru Technological University ");
		System.out.println(" Vallurupalli Nageswara Rao Vignana Jyothi Institute of Engineering &Technology ");
	}
	
	void selectCollege(int clg_code1 , int clg_code2) {
	    System.out.println(" college code is " +clg_code1);
		System.out.println(" college code is " +clg_code2);
	
	}
	
	int seatAlloted() {
		return 1601;
	}
	
	String payFee(int fee) {
		System.out.println(" collage fee is "+fee);
		return "fee paid";
	}
}

class Student {
    public static void main(String args[]){
        University un=new University();
		un.listOfCollege();
		un.selectCollege(18129,1601);
		System.out.println("Check for Seat allotment of students and Information about documents required and guidelines to fill the form is given " +un.seatAlloted());
		System.out.println(" collage fee is " +un.payFee(80000));
	}
}