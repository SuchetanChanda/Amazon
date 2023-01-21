package Customer;

public class Customer {
	public String name;
	public int id;
	public long mobileNo;
	public String type;
	public boolean loginStatus=false;
	
	public void login()
	{
		loginStatus = true;
	}
	public void logOut()
	{
		loginStatus = false;
	}
	public void showStatus() 
	{
		if(loginStatus)
			System.out.println(name + " is logged in.");
		else
			System.out.println(name + " is logged out.");
	}
}
