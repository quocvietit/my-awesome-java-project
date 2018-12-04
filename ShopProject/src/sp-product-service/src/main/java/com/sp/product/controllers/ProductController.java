package com.sp.product.controllers;

import com.sp.product.entities.ProductDTO;
import com.sp.product.models.Product;
import com.sp.product.services.ProductService;
import javafx.scene.media.Media;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;


	@GetMapping
	public Product getProduct(
			@RequestParam(name = "product_name") String productName
	) throws Exception{
		return productService.getProductDetail(productName);
	}

	@PostMapping
	public Product addProduct(
			@RequestBody ProductDTO product
	) throws Exception{
		return productService.addProduct(product);
	}
}
