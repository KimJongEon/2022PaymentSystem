package com.jongeon.paymentsystem.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
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
	
	// 메뉴(상품) 목록 API
	@GetMapping("/menuList")
	public List<ProductVO> getProductList(){
		
		return productService.getProductList();
	}
}
