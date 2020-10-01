package com.product.ms1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.ms1.dao.ProductDao;
import com.product.ms1.dto.ProductDto;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao productDao;
	
	@Override
	public List<ProductDto> getProducts() {
		return productDao.getProducts();
	}

	@Override
	public ProductDto save(ProductDto productDto) {
		return productDao.save(productDto);
	}

	@Override
	public ProductDto getProduct(String productId) {
		return productDao.getProduct(productId);
	}

	@Override
	public void deleteProduct(String productId) {
		productDao.deleteProduct(productId);
	}

}
