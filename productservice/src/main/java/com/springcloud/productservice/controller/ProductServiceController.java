package com.springcloud.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.productservice.dto.ProductEntryDTO;
import com.springcloud.productservice.service.ProductService;

@RestController
public class ProductServiceController {

	@Autowired
	private ProductService productService;

	public ProductEntryDTO getProducts() {
		return productService.getProductEntry();
	}

}
