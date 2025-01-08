package com.model;
import javax.persistence.*;
@Entity
@Table(name = "Product")
public class Product {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "PCode",length=4)
	int code;
	 @Column(name = "PName",length=10)
	String name;
	 @Column(name = "Price",length=7)
	double price;
	 @Column(name = "Brand",length=10)
	String brand;
	 @Column(name = "MfgDate" ,length =10)
     String mfgdate ;
	 
	

	public Product(int code, String name, double price, String brand,String mfgdate) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.mfgdate = mfgdate;
		
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getMfgdate() {
		return mfgdate;
	}
	public void setMfgdate(String mfgdate) {
		this.mfgdate = mfgdate;
	}
	
	public Product() {
		

	}

	@Override
	public String toString() {
		return "Product [code=" + code + ", name=" + name + ", price=" + price + ", brand=" + brand + ", mfgdate="
				+ mfgdate + "]";
	}


}
