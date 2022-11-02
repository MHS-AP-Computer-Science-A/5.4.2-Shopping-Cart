
public class ShoppingCartTester {
	 public static void main(String[] args)
	    {
	        //The code below will test your class. Uncomment as you
	        //complete the class to check your work
	        
	        // Make a ShoppingCart object
			ShoppingCart cart1 = new ShoppingCart();
			// Test toString before adding items
			System.out.println("**Printing an empty cart**\n" + cart1);
			
			// Test add items
			//cart1.addItem("Lip Gloss", 4.95);
			//cart1.addItem("Doritos", 3.50);
			//System.out.println("**Printing a cart with 2 items**\n" +cart1);
			
			// Test instructions setter
			//cart1.setInstructions("Leave package on roof");
			//System.out.println("**Printing a cart with instructions**\n" + cart1);
			
			// Test instructions getter
			//System.out.println("**Printing just the instructions**\n" + cart1.getInstructions() + "\n");
		 
			// Test free shipping for orders > $50
			//cart1.addItem("Playstation 5", 499.00);
			//System.out.println("**Printing an order that qualifies for free shipping**\n" + cart1);
			
			// Test removeItem
			//cart1.removeItem("Doritos", 3.50);
			//System.out.println("**Printing an cart after removing an item**\n" + cart1);
			
			// Verify that the shipping charge returns when total goes under 50
			//cart1.removeItem("Playstation 5", 499.00);
			//System.out.println("**Printing a cart that no longer qualifies for free shipping**\n" + cart1);
			
	    }
}
