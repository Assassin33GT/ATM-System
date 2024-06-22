package investmentt1234;

public abstract class account {
	
	String name;
	String country;
	String city;
    String Password;
    
	public account( String name, String country, String city,String Password) {
	    
		this.name = name;
		this.country = country;
		this.city = city;
		
		this.Password = Password;
	}

    public void setName(String name)
    {
    	this.name = name;
    }

    public String getName()
    {
    	return name;
    }

	

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPassword() {
		return Password;
	}
	
	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "Account [ name=" + name + ", country=" + country + ", city=" + city + " Password=" + Password + "]";
	}
	 
}
