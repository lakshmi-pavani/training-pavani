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

class Chocolates {
    public static void main(String args[]) {
        Dairymilk d = new Dairymilk();
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


