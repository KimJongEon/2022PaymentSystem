package com.jongeon.paymentsystem.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jongeon.paymentsystem.domain.ProductVO;

@Mapper
public interface ProductMapper {
	
	// 상품 목록 가져오는 메소드
	public List<ProductVO> getProductList();

}
