package com.jongeon.paymentsystem.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jongeon.paymentsystem.domain.ProductVO;
import com.jongeon.paymentsystem.service.ProductService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class MenuController {
	private ProductService productService;
	
	// 상품 추가 API
	@PostMapping("/registrationProduct")
	public List<ProductVO> registerProduct(@RequestBody Map<String, Object> editedProductListMap) {
		long registerProduct = 0;
		registerProduct = productService.registerProduct(editedProductListMap);
		
		if(registerProduct == 1) { // registerProduct DB insert 완료 했으면 ProductList return 
			return productService.getProductList();
		}else {
			return null;
		}
	}
	
	// 상품 삭제 API
	@PostMapping("/deletionProduct/{productIdx}")
	public List<ProductVO> deleteProduct(@PathVariable(value="productIdx") long productIdx) {
		long deleteProduct = 0;
		deleteProduct = productService.deleteProduct(productIdx);
		if(deleteProduct == 1) { // DB delete true
			return productService.getProductList();
		}else {
			return null;
		}
		 			
	}
}
