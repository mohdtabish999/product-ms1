package com.product.ms1.util;

import com.product.ms1.dto.ProductDto;
import com.product.ms1.model.Product;

public class ProductUtil {
	
	public static ProductDto transformProductToProductDto(Product product) {
		return new ProductDto(product.getId(),product.getName(),product.getPrice(),product.getImageUrl());
	}

	public static Product transformProductDtoToProduct(ProductDto productDto) {
		return new Product(productDto.getId(),productDto.getName(),productDto.getPrice(),productDto.getImageUrl());
	}
}
