// 조가희 : 결제화면 Mapper Interface (DAO)
// DAO : 데이터베이스에 접근해서 작업을 하는 부분만을 소유한 클래스.

package com.example.travelboard.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.payment.model.Payment;

@Mapper
public interface PaymentMapper {
	public int insert(Payment payment);
	
}
