package com.jongeon.paymentsystem.service;

import java.util.List;
import java.util.Map;

public interface OrderService {
	// 주문
	public long order(List<Map<String, Object>> orderMap, String paymentType);
	
	
}
