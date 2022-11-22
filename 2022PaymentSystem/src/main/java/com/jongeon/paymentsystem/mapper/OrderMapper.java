package com.jongeon.paymentsystem.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.jongeon.paymentsystem.domain.OrderVO;


@Mapper
public interface OrderMapper {

	// 주문 
	public long registerOrder(Map<String, String> paymentTypeMap);
	
	// 주문 디테일
	public long registerOrderDetail( // 2개이상의 파라미터를 넘길 때는 @Param 어노테이션을 이용하여 파라미터를 지정해주어야 한다
			@Param("orderIdx") long orderIdx,
			@Param("productCount") long productCount,
			@Param("productName") String productName,
			@Param("productPrice") long productPrice
			);

	// 주문 내역 가져오는 메소드
	public List<Map<String, Object>> getOrderHistory();

	// 주문 상세 내역 가져오는 메소드
	public List<Map<String, Object>> getOrderHistoryDetail(long orderIdx);
	
}
