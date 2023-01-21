package Products;

public class Products {
	public String name;
	public int id;
	public int quantity;
	public int weight;
	public double shippingCharges;
	
	public void availability() {
		if(quantity<=0)
			System.out.println(name + " is out of stock.");
		else if(quantity<=5)
			System.out.println("Only "+ quantity +" left!");
		else
			System.out.println(name + " is available in stock.");
	}
	
	public void FindShippingCharges(int weight)
	{
		if(weight <= 0)
			shippingCharges = 0;
		else if(weight > 50)
			shippingCharges= 100 + (weight*4)/100 ;
		else 
			shippingCharges = 50 + (weight*4)/100;
		
		System.out.println("Shipping charges for "+name + " is "+ shippingCharges);
	}
	
}
