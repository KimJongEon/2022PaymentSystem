package com.jongeon.paymentsystem.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class OrderDetailVO {
	private long orderDetailIdx; // PK
	private long productCount; // 주문한 상품 개수
	private long orderIdx; // FK 주문번호
	private long productIdx; // FK 상품 (고유)번호
	
	// 조인 할때 쓰일 것들
	private long orderPrice; // 주문 금액
}
