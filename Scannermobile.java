import java.util.*;
class Samsung {
	String sim;
    int storage;
    String osversion;
    int camerapixels;
    int batterycapacity;
    double screenresolution;
    String model;
	String colour;
    int ram;
	String touchscreen;
}

 class Mi {
    String sim;
    int storage;
    String osversion;
    int batterycapacity;
    String model;
    String colour;
    int camerapixels;
	String touchscreen;
	 int ram;
}

class Scannermobile {
    public static void main(String args[]) {
        Samsung  s=new Samsung();
		Scanner sc=new Scanner(System.in);
        s.ram=sc.nextInt();
        s.touchscreen=sc.next();
        System.out.println(".............................samsung mobile details..............................");
		System.out.println("samsung sim=" );
		s.sim=sc.next();
        System.out.println( "storage=" );
		s.storage=sc.nextInt();
        System.out.println("version=" );
		 s.osversion=sc.next();
        System.out.println("camera=" );
		s.camerapixels=sc.nextInt();
        System.out.println(" battery capacity=" );
		s.batterycapacity =sc.nextInt();
        System.out.println("screen resolution=");
		 s.screenresolution=sc.nextDouble();
        System.out.println("model=" );
		 s.model=sc.next();
		System.out.println("colour = " );
		s.colour=sc.next();
       


        Mi m=new Mi();
		Scanner sc1=new Scanner(System.in);
		m.touchscreen=sc.next();
		m.ram=sc.nextInt();
        System.out.println(".............................mi mobile details..............................");
        System.out.println("mi sim=" );
		m.sim=sc1.next();
        System.out.println("storage=");
		m.storage=sc.nextInt();
        System.out.println("version=");
		 m.osversion=sc.next();
        System.out.println("camerapixels=");
		 m.camerapixels=sc.nextInt();
        System.out.println("mobile colour=");
		 m.colour=sc.next();
        System.out.println("mobile model=");
		m.model=sc.next();
        System.out.println("battery capacity=");
		m.batterycapacity=sc.nextInt();

}}
