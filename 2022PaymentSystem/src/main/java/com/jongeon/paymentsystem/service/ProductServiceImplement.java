package com.jongeon.paymentsystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jongeon.paymentsystem.domain.ProductVO;
import com.jongeon.paymentsystem.mapper.ProductMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor // 생성자 생성 안하면 return 값 null값 나옴
public class ProductServiceImplement implements ProductService {
	private ProductMapper productMapper;
	
	// 상품 목록 가져오는 메소드
	@Override
	public List<ProductVO> getProductList() {
		// TODO Auto-generated method stub
		return productMapper.getProductList();
	}

}
