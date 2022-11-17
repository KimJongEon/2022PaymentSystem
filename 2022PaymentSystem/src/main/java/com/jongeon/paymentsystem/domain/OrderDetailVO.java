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
	private Long orderDetailIdx; // PK
	private Long orderPrice; // 주문 금액
	private Long productCount; // 주문한 상품 개수
	private Long orderNumber; // FK 주문번호
	private Long productIdx; // FK 상품 (고유)번호
}
