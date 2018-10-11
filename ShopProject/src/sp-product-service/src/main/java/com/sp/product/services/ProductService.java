package com.sp.product.services;

import com.sp.product.entities.ProductDTO;
import com.sp.product.models.Product;
import com.sp.product.repositorys.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public Product getProductDetail(String productName) throws Exception{
		 return productRepository.findByName(productName);
	}

	public Product addProduct(ProductDTO productDTO) throws Exception{
		Product product = getProductDetail(productDTO.getName());
		if(product==null){
			product = new Product();
			product.setName(productDTO.getName());
			product.setDescription(productDTO.getDescription());
			product.setPrice(productDTO.getPrice());

			product = productRepository.save(product);
		}
		return product;
	}
}
