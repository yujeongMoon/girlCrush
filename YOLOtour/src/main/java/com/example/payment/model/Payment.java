// 조가희 : 결제화면 Model
// Oracle에 올라와있는 PAYMENT_BOARD 테이블 내용을 바탕으로 작성함.
package com.example.payment.model;

import lombok.Data;

@Data
public class Payment {
	private long id;				// ID NUMBER
	private String name;			// NAME
	private String email;			// EMAIL
	private String address;			// ADDRESS
	private String nameOnCard;	 	// NAME_ON_CARD
	private long creditCardNumber;	// CREADITCARD_NUMBER
	private int expMonth;			// EXP_MONTH
	private int expYear;			// EXP_YEAR
	private int cvc;				// CVC
}


//	Create table PAYMENT_BOARD(
//	ID NUMBER(10,0) NOT NULL PRIMARY KEY,
//	NAME VARCHAR2(20) NOT NULL,
//	EMAIL VARCHAR2(30) NOT NULL,
//	ADDRESS VARCHAR2(30) NOT NULL,
//	NAME_ON_CARD VARCHAR2(20) NOT NULL,
//	CREDITCARD_NUMBER VARCHAR2(30) NOT NULL,
//	EXP_MONTH NUMBER NOT NULL,
//	EXP_YEAR NUMBER NOT NULL,
//	CVC NUMBER NOT NULL
//	);
