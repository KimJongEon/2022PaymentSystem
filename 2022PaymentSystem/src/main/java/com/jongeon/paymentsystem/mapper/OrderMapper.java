package com.jongeon.paymentsystem.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.jongeon.paymentsystem.domain.OrderVO;

@Mapper
public interface OrderMapper {
	
	// 주문
	public long order(OrderVO orderVO);
}
