package com.springcloud.productservice.dto;

public class ProductEntryDTO {
	
	private ProductDTO productDetail;
	
	private long productQuantity;

	public ProductDTO getProductDetail() {
		return productDetail;
	}

	public void setProductDetail(ProductDTO productDetail) {
		this.productDetail = productDetail;
	}

	public long getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(long productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	
	

}
