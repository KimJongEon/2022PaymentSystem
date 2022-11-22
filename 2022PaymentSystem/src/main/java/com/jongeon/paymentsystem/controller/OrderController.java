package com.jongeon.paymentsystem.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jongeon.paymentsystem.domain.OrderVO;
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

	// 주문 내역 API
	@GetMapping("/orderHistory")
	public List<Map<String, Object>> getOrderHistory(){
		return orderService.getOrderHistory();
	}
	
	// 주문 상세 내역 API
	@GetMapping("orderHistoryDetail")
	public List<Map<String, Object>> orderHistoryDetail(@RequestParam long orderIdx){
		
//		System.out.println("주문 상세 내역 API : " + orderIdx);
		
		return orderService.getOrderHistoryDetail(orderIdx);
	}
	
	
	// 상품 목록 API
	@GetMapping("/productList")
	public List<ProductVO> getProductList() {
		
		return productService.getProductList();
	}
	
	// 현금 결제 API (= 주문 처리)
	@PostMapping("/paymentCash")
	public long paymentCash(@RequestBody List<Map<String, Object>> orderMap) {
		String paymentType = "cash"; // 결제 방식 : 현금
		long registerOrder = 0;
		// registerOrder메소드에서 주문, 주문상세 같이 처리
		if (orderMap.size() != 0) {
			registerOrder = orderService.registerOrder(orderMap, paymentType);
			if (registerOrder != 0) {
				return 1;
			} else {
				return 0;
			}
		} else {
			return 0;
		}
	} // paymentCash END

	// 카드 결제 API (= 주문 처리)
	@PostMapping("/paymentCard")
	public long paymentCard(@RequestBody List<Map<String, Object>> orderMap) {
		String paymentType = "card"; // 결제 방식 : 현금
		long registerOrder = 0;
		// registerOrder메소드에서 주문, 주문상세 같이 처리
		if (orderMap.size() != 0) {
			registerOrder = orderService.registerOrder(orderMap, paymentType);
			if (registerOrder != 0) {
				return 1;
			} else {
				return 0;
			}
		} else {
			return 0;
		}
	} // paymentCard END

	// 테스트
	@GetMapping("/hello")
	public List<String> hello() {

		return Arrays.asList("안녕하세요", "Hello");
	}
}
