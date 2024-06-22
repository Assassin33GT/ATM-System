package investmentt1234;

import java.util.ArrayList;

public class investor extends account implements investment{
     
	ArrayList<Company>s1=new ArrayList<>();
	static int id;
	double balance;
	Company a;
	
	public investor( String name, String country, String city, double balance, String Password)
	{
		super( name, country, city,  Password);
		id++;
		this.balance = balance;
	}
	
	public static int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getDeposite(double deposite)
	{
		balance = balance + deposite;
		return balance;
	}
	@Override
	public double buy(double no_of_shares) {
		
		
			balance = (balance - (no_of_shares * a.priceofeachshare));
		
		return balance;
	}
	@Override
	public void sell(double no_of_shares) {
		balance = balance + (no_of_shares * a.priceofeachshare);
	}

	@Override
	public String toString() {
		return "investor ["+" balance=" + balance  + ", name=" + name + ", country=" + country
				+ ", city=" + city + ", Password=" + Password + "]";
	}
	
	
	
	
}
