package com.springcloud.productservice.service.impl;

import org.springframework.stereotype.Service;

import com.springcloud.productservice.dto.ProductDTO;
import com.springcloud.productservice.dto.ProductEntryDTO;
import com.springcloud.productservice.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Override
	public ProductEntryDTO getProductEntry() {
		ProductEntryDTO productEntryDTO = new ProductEntryDTO();
		productEntryDTO.setProductQuantity(5);
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProductDescription("Nikon 365 EOS is recently launched with 87 megapixel camera");
		productDTO.setProductId("NIKS78882");
		productDTO.setProductName("Nikon 365");
		productDTO.setProductPrice(290000);
		productDTO.setProductTax(78);
		productEntryDTO.setProductDetail(productDTO);
		return productEntryDTO;
	}
	
}
