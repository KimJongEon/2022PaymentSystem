package com.jongeon.paymentsystem.service;

import java.util.List;
import java.util.Map;

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
	
	// 주문
	@Override
	public long order(List<Map<String, Object>> orderMap, String paymentType) {
		// TODO Auto-generated method stub
		System.out.println("orderMap.size() : " + orderMap.size());
		OrderVO orderVO = new OrderVO(null, null, paymentType);

		// DB insert
		
		// DB insert False 0
		
		// DB insert true 1
		
		
		return orderMapper.order(orderVO.order());
	}

}
