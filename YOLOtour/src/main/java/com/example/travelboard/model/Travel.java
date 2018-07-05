// 조가희 : 여행상품리스트
// Oracle에 올라와있는 travel_board 테이블 내용을 바탕으로 작성함.
// Controller클래스에게 요청받은 내용을 가공한다.
// 데이터가 DB에 있을경우 DB에 요청해서 가져와서 가공한 결과를 다시 Controller에게 보낸다.
package com.example.travelboard.model;

import java.util.Date;

import lombok.Data;

@Data
public class Travel {
	private long id;        // ID
	private String writer;  // WRITER
	private String title;   // TITLE
	private String content; // CONTENT
	private Date regDate;   // REG_DATE
	private long hitCount;  // HIT_COUNT
}


// Create table travel_board(
// ID NUMBER(10,0) NOT NULL PRIMARY KEY,
// WRITER VARCHAR2(100) DEFAULT NULL,
// TITLE VARCHAR2(255) DEFAULT NULL,
// CONTENT VARCHAR2(4000) DEFAULT NULL,
// REG_DATE DATE DEFAULT NULL,
// HIT_COUNT NUMBER(10,0) DEFAULT 0
// );
