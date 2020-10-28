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

class Mobile {
    public static void main(String args[]) {
        Samsung  s=new Samsung();
		s.sim="single sim";
        s.storage=32;
        s.osversion="Tizen";
        s.camerapixels=108;
        s.batterycapacity =4000;
		s.colour="black moon";
        s.screenresolution=6.4;
        s.model="samsung z3";
        s.ram=4;
        s.touchscreen= "yes";
        System.out.println(".............................samsung mobile details..............................");
		System.out.println("samsung sim=" +s.sim);
        System.out.println( "storage=" +s.storage);
        System.out.println("version=" +s.osversion);
        System.out.println("camera=" +s.camerapixels);
        System.out.println(" battery capacity=" +s.batterycapacity);
        System.out.println("screen resolution=" +s.screenresolution);
        System.out.println("model=" +s.model);
		System.out.println("colour = " +s.colour);
       


        Mi m=new Mi();
        m.sim="dual sim";
        m.storage=64;
        m.osversion="Android";
        m.camerapixels=49;
        m.colour="black";
        m.model="readmi note7 pro";
        m.batterycapacity=6000;
		m.touchscreen="yes";
		m.ram=3;
        System.out.println(".............................mi mobile details..............................");
        System.out.println("mi sim=" +m.sim);
        System.out.println("storage="+m.storage);
        System.out.println("version="+m.osversion);
        System.out.println("camerapixels="+m.camerapixels);
        System.out.println("mobile colour="+m.colour);
        System.out.println("mobile model="+m.model);
        System.out.println("battery capacity="+m.batterycapacity);

}}
