package com.jongeon.paymentsystem.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.util.MapUtil;
import org.springframework.stereotype.Service;

import com.jongeon.paymentsystem.domain.OrderVO;
import com.jongeon.paymentsystem.mapper.OrderMapper;

import lombok.AllArgsConstructor;

@Service
//자동으로 모든 매개변수를 받는 생성자 생성
//생성자 생성 안하면 signUpMapper.signUp(memberVO.signUp()); 에서 null값 나옴
@AllArgsConstructor
public class OrderServiceImplement implements OrderService {
	private OrderMapper orderMapper;

	// 주문 등록
	@Override
	public long registerOrder(List<Map<String, Object>> orderMap, String paymentType) {
		// TODO Auto-generated method stub
		// DB insert False 0, DB insert true 1
		if (orderMap.size() != 0) {
			
			Map<String, String> paymentTypeMap = new HashMap<>();
			paymentTypeMap.put("paymentType", paymentType);
			orderMapper.registerOrder(paymentTypeMap); // 주문 DB insert
			
			for(int i =0; i < orderMap.size(); i++) {
				// orderIdx, count, productName, productPrice
				long orderIdx = Long.parseLong(String.valueOf(paymentTypeMap.get("orderIdx")));
				long productCount = Long.parseLong(String.valueOf(orderMap.get(i).get("count")));
				String productName =String.valueOf(orderMap.get(i).get("productName"));
				long productPrice =  Long.parseLong(String.valueOf(orderMap.get(i).get("productPrice")));
				orderMapper.registerOrderDetail(orderIdx, productCount, productName, productPrice); // 주문 디테일 DB insert
			}
			
			return 1;
			
		} else {
			System.out.println("orderMap size가 0 이거나 값이 존재하지 않습니다.");
			return 0;
		} // orderMap.size() if else END

	}
	
	// 주문 내역 가져오는 메소드
	@Override
	public List<Map<String, Object>> getOrderHistory() {
		// TODO Auto-generated method stub
		return orderMapper.getOrderHistory();
	}

	// 주문 상세 내역 가져오는 메소드
	@Override
	public List<Map<String, Object>> getOrderHistoryDetail(long orderIdx) {
		// TODO Auto-generated method stub
		return orderMapper.getOrderHistoryDetail(orderIdx);
	}

} // OrderServiceImplement END
