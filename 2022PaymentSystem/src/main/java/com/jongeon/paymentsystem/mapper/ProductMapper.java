package com.jongeon.paymentsystem.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.jongeon.paymentsystem.domain.ProductVO;

@Mapper
public interface ProductMapper {
	
	// 상품 목록 가져오는 메소드
	public List<ProductVO> getProductList();
	
	// 상품 추가 메소드
	public long registerProduct(
			@Param("productName") String productName, 
			@Param("productPrice") long productPrice);
	
	// 상품 삭제 메소드
	public long deleteProduct(long productIdx);

}
