class Mobile {
    String mobilename;
    int storage;
	String osversion;
	double camerapixels;
	
	Mobile(String mobilename,int storage,String osversion,double camerapixels){
	    this.mobilename=mobilename;
	    this.storage=storage;
	    this.osversion=osversion;
	    this.camerapixels=camerapixels;
		this.display();
	}
	void display() {
	    System.out.println("mobile name  ="+mobilename);
		System.out.println("mobile storage=" +storage);
		System.out.println("mobile version =" +osversion);
		System.out.println("mobile camera pixel =" +camerapixels);
	}
}

class Mobilespecification {
    public static void main(String args[]) {
	    Mobile m=new Mobile("samsung",32,"android",1084);
	}
}
        	  