package com.springcloud.productservice.dto;

public class ProductDTO {
	
	private String productId;
	private String productName;
	private double productPrice;
	private double productTax;
	private String productDescription;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public double getProductTax() {
		return productTax;
	}
	public void setProductTax(double productTax) {
		this.productTax = productTax;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	@Override
	public String toString() {
		return "ProductDTO [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productTax=" + productTax + ", productDescription=" + productDescription + "]";
	}
	
	
	
}
