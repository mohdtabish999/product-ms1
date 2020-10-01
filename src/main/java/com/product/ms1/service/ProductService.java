package com.product.ms1.service;

import java.util.List;

import com.product.ms1.dto.ProductDto;

public interface ProductService {
	
	List<ProductDto> getProducts();
	ProductDto save(ProductDto productDto);
	ProductDto getProduct(String productId);
	void deleteProduct(String productId);

}
