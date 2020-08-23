package com.myproduct.model;

public class Product {

	private int productId;
	private int productPrice;
	private String productName; 
	private String productBrand;
	private String productaddress;
	private String productDate;
	
	
	public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public int getProductPrice() {
	return productPrice;
}
public void setProductPrice(int productPrice) {
	this.productPrice = productPrice;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductBrand() {
	return productBrand;
}
public void setProductBrand(String productBrand) {
	this.productBrand = productBrand;
}
public String getProductaddress() {
	return productaddress;
}
public void setProductaddress(String productaddress) {
	this.productaddress = productaddress;
}
public String getProductDate() {
	return productDate;
}
public void setProductDate(String productDate) {
	this.productDate = productDate;
}
public Product(int productId, int productPrice, String productName, String productBrand, String productaddress,
		String productDate) {
	super();
	this.productId = productId;
	this.productPrice = productPrice;
	this.productName = productName;
	this.productBrand = productBrand;
	this.productaddress = productaddress;
	this.productDate = productDate;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Procuct [productId=" + productId + ", productPrice=" + productPrice + ", productName=" + productName
			+ ", productBrand=" + productBrand + ", productaddress=" + productaddress + ", productDate=" + productDate
			+ "]";
}

}
