package com.jongeon.paymentsystem.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jongeon.paymentsystem.domain.ProductVO;
import com.jongeon.paymentsystem.service.OrderService;
import com.jongeon.paymentsystem.service.ProductService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class OrderController {
	private ProductService productService;
	private OrderService orderService;
	// 상품 목록 API
	@GetMapping("/productList")
	public List<ProductVO> getProductList() {

//		System.out.println("테스트 - getProductList : "+productService.getProductList().get(0).getProductName());
//		System.out.println("테스트 - getProductList : "+productService.getProductList().get(1).getProductName());
//		System.out.println("테스트 - getProductList : "+productService.getProductList().get(2).getProductName());
		return productService.getProductList();
	}

	// 현금 결제 API (= 주문 처리)
	@PostMapping("/paymentCash")
	public String paymentCash(@RequestBody List<Map<String, Object>> orderMap) {
		String paymentType = "cash";
		System.out.println("현금 결제 API");
		// OrderVO 후에 OrderDetailVO
		
		// 주문
		long order = orderService.order(orderMap, paymentType);

		// 주문 디테일
		
		
		
//		List<Map<String, Object>> paramMap
//		for (int i = 0; i < paramMap.size(); i++) {
//		System.out.println(paramMap.get(i));
//		System.out.println(paramMap.get(i).get("productIdx"));
//		System.out.println(paramMap.get(i).get("productName"));
//		System.out.println(paramMap.get(i).get("productPrice"));
//		System.out.println(paramMap.get(i).get("count"));
//		
////		return mapper.order(mbrIdx, postNumber, replyContent);
//	}
		return orderMap.toString();
	}

	// 카드 결제 API (= 주문 처리)
	@PostMapping("/paymentCard")
	public String paymentCard(@RequestBody List<Map<String, Object>> paramMap) {
		System.out.println("카드 결제 API");
		// OrderVO 후에 OrderDetailVO

		return paramMap.toString();
	}

	// 테스트
	@GetMapping("/hello")
	public List<String> hello() {

		return Arrays.asList("안녕하세요", "Hello");
	}
}
