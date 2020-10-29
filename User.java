class Onlineshopping {
    void purchaseProduct() {
	    System.out.println(" men dress,womens dress, festive store,gadgets");
	}
	
	void selectProduct(String product) {
	    System.out.println(" select the product is " +product);
	}
	
	String addCart( int addcart) {
	    System.out.println(" add to bag "+addcart);
		return "two";
	}
	
	int totalAmount() {
	return 2353;
	}
	
	String checkOuts(int amount) {
	    System.out.println(" paid amount is "+amount);
		return "paid sucessfully";
	}
}

class User {
    public static void main(String args[]){
	    Onlineshopping o=new Onlineshopping();
		o.purchaseProduct();
		o.selectProduct("womens_dress");
		System.out.println("products are added in bag " +o.addCart(2));
		System.out.println("total amount is "+o.totalAmount());
		System.out.println("total amount is " +o.checkOuts(2353));
	}
}
	