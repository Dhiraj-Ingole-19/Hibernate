

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

	 @Column(name = "Street" ,length =12)
	private String street;
	 @Column(name = "City" ,length =10)
	private String city;
	 @Column(name = "Country" ,length =10)
	private String country;
	 @Column(name = "Pincode" ,length =10)
	private String pincode;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String street, String city, String country, String pincode) {
		super();
		this.street = street;
		this.city = city;
		this.country = country;
		this.pincode = pincode;
	}
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", country=" + country + ", pincode=" + pincode + "]";
	}


	
}
