import java.util.*;
class Dairymilk {
    int numberofbytes;
    int price;
    int weight;
	String brand;
    String flavour;
    String manufacture;
}

class Fuse {
    String flavour;
	int price;
    int weight;
    String brand;
    String ingredients;
} 

class Scannerchocolates {
    public static void main(String args[]) {
        Dairymilk d = new Dairymilk();
		Scanner sc=new Scanner(System.in);
        System.out.println("..........................dairy milk............................");
        System.out.println("number of bytes = " );
		d.numberofbytes = sc.nextInt();
        System.out.println("price = ");
		d.price = sc.nextInt();
        System.out.println("brand = ");
		 d.brand = sc.next();
        System.out.println("chocolate flavour = ");
		 d.flavour = sc.next();
        System.out.println("chocolate weight = " );
		d.weight = sc.nextInt();
        System.out.println("chocolate manufacture company = ");
		d.manufacture=sc.next();
		
        d.numberofbytes = 6;
        d.price = 100;
        d.brand = "Cadbury";
        d.flavour = "milky";
        d.weight = 150;
        d.manufacture="Mondelez India Foods Limited";
        System.out.println("..........................dairy milk............................");
        System.out.println("number of bytes = " +d.numberofbytes);
        System.out.println("price = "+d.price);
        System.out.println("brand = " +d.brand);
        System.out.println("chocolate flavour = " +d.flavour);
        System.out.println("chocolate weight = " +d.weight);
        System.out.println("chocolate manufacture company = "+d.manufacture);

        Fuse f = new Fuse();
		Scanner sc1=new Scanner(System.in);
        System.out.println("..................................Fuse...........................");
        System.out.println("fuse  flavour =");
		f.flavour = sc1.next();
		System.out.println("price = ");
		f.price =sc1.nextInt();
        System.out.println("fuse chocolate weight = " );
		f.weight = sc1.nextInt();
        System.out.println(" brand = " );
		f.brand = sc1.next();
        System.out.println("ingredients = ");
		f.ingredients = sc1.next();
		
        f.flavour = "Milk Chocolate";
		f.price = 20;
        f.weight = 660;
        f.brand = "Cadbury Fuse";
        f.ingredients = "Peanuts ";
        System.out.println("..................................Fuse...........................");
        System.out.println("fuse  flavour = " +f.flavour);
		System.out.println("price = "+f.price);
        System.out.println("fuse chocolate weight = " +f.weight);
        System.out.println(" brand = " +f.brand);
        System.out.println("ingredients = " +f.ingredients);
}
}


