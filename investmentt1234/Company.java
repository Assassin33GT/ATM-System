package investmentt1234;

public class Company extends account {

	
	int numberofshares;
	int maxSell;
	double priceofeachshare;
	
  public Company(String name, String country, String city, String Password,  int numberofshares, double priceofeachshare, int maxSell) {
	  
		super(name, country, city, Password);
		this.numberofshares = numberofshares;
		this.priceofeachshare = priceofeachshare;
		this.maxSell = maxSell;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberofshares() {
		return numberofshares;
	}
	public void setNumberofshares(int numberofshares) {
		this.numberofshares = numberofshares;
	}
	public double getPriceofeachshare() {
		return priceofeachshare;
	}
	public void setPriceofeachshare(double priceofeachshare) {
		this.priceofeachshare = priceofeachshare;
	}
	
	
	
	public double getMaxsell()
	{
		return maxSell;
	}
	@Override
	public String toString() {
		return "Company [numberofshares=" + numberofshares + ", maxSell=" + maxSell + ", priceofeachshare="
				+ priceofeachshare + ", name=" + name + ", country=" + country + ", city=" + city + ", Password="
				+ Password + "]";
	}
	public void setMaxSell(int maxSell) {
		this.maxSell = maxSell;
	}
	
}
