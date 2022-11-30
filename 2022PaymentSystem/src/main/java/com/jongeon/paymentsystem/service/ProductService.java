package com.jongeon.paymentsystem.service;

import java.util.List;
import java.util.Map;

import com.jongeon.paymentsystem.domain.ProductVO;

public interface ProductService {
	
	// 상품 목록 가져오는 메소드
	public List<ProductVO> getProductList();
	
	// 상품 추가 메소드
	public long registerProduct(Map<String, Object> editedProductListMap);

	// 상품 삭제 메소드
	public long deleteProduct(long productIdx); 

}
