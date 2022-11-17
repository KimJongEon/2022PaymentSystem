package com.jongeon.paymentsystem.service;

import java.util.List;

import com.jongeon.paymentsystem.domain.ProductVO;

public interface ProductService {
	
	// 상품 목록 가져오는 메소드
	public List<ProductVO> getProductList(); 

}
