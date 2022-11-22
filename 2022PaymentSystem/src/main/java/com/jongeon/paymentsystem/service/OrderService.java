package com.jongeon.paymentsystem.service;

import java.util.List;
import java.util.Map;

import com.jongeon.paymentsystem.domain.OrderVO;

public interface OrderService {
	// 주문
	public long registerOrder(List<Map<String, Object>> orderMap, String paymentType);
	
	// 주문 내역 가져오는 메소드
	public List<Map<String, Object>> getOrderHistory();

	// 주문 상세 내역 가져오는 메소드
	public List<Map<String, Object>> getOrderHistoryDetail(long orderIdx);
	
}
