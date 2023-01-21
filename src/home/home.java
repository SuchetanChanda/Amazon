package home;
import Customer.Customer;
import Products.Products;
import java.util.*;

public class home {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Customer c1 = new Customer();
		System.out.println("Enter the name: ");
		c1.name=sc.nextLine();
		System.out.println("Enter the id: ");
		c1.id=sc.nextInt();
		System.out.println("Enter mobile no: ");
		c1.mobileNo=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter type: ");
		c1.type=sc.nextLine();
		Customer c2 = new Customer();
		System.out.println("Enter the name: ");
		c2.name=sc.nextLine();
		System.out.println("Enter the id: ");
		c2.id=sc.nextInt();
		System.out.println("Enter mobile no: ");
		c2.mobileNo=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter type: ");
		c2.type=sc.nextLine();
		c1.login();
		c2.login();
		c1.showStatus();
		c2.showStatus();
		c1.logOut();
		c2.logOut();
		c1.showStatus();
		c2.showStatus();
		
		Products p1 = new Products();
		System.out.println("Enter the name: ");
		p1.name =sc.nextLine();
		System.out.println("Enter the id: ");
		p1.id=sc.nextInt();
		System.out.println("Enter the weight: ");
		p1.weight=sc.nextInt();
		System.out.println("Enter the quantity: ");
		p1.quantity=sc.nextInt();
		sc.nextLine();
		p1.availability();
		p1.FindShippingCharges(p1.weight);
		
		Products p2 = new Products();
		System.out.println("Enter the name: ");
		p2.name =sc.nextLine();
		System.out.println("Enter the id: ");
		p2.id=sc.nextInt();
		System.out.println("Enter the weight: ");
		p2.weight=sc.nextInt();
		System.out.println("Enter the quantity: ");
		p2.quantity=sc.nextInt();
		p2.availability();
		p2.FindShippingCharges(p2.weight);
	}

}
