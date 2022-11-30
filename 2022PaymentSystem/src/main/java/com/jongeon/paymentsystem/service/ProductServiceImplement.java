package com.jongeon.paymentsystem.service;

import java.util.List;
import java.util.Map;

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
	
	
	// 상품 등록
	@Override
	public long registerProduct(Map<String, Object> editedProductListMap) {
		// TODO Auto-generated method stub
		String productName = String.valueOf(editedProductListMap.get("productName"));
		long productPrice = Long.parseLong(String.valueOf(editedProductListMap.get("productPrice")));
		
		System.out.println(productName);
		System.out.println(productPrice);
		return productMapper.registerProduct(productName, productPrice);
	}

	
	// 상품 삭제
	@Override
	public long deleteProduct(long productIdx) {
		// TODO Auto-generated method stub
		return productMapper.deleteProduct(productIdx);
	}

}
