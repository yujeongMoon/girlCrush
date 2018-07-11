// 조가희 : 국내여행상품화면  Mapper interface (DAO)
// DAO : 데이터베이스에 접근해서 작업을 하는 부분만을 소유한 클래스. 
package com.example.travelboard.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.travelboard.model.DomesticTravel;

// 마이바티스가 인터페이스 구현클래스를 만들어서 스프링에게 제공한다.
@Mapper
public interface DomesticTravelMapper {
	public int insert(DomesticTravel travel);
	public int update(DomesticTravel travel);
	public int delete(int tbdId);
	
	@Select("SELECT COUNT(*) FROM TRAVEL_BOARD_DOMESTIC")
	public int count();
	
	@Select("SELECT * FROM TRAVEL_BOARD_DOMESTIC ORDER BY TBD_ID DESC")
	public List<DomesticTravel> selectAll();
	
	public DomesticTravel selectById(int tbdId);
	public List<DomesticTravel> selectByLimit(@Param("page") int page, @Param("size") int size);
	public int increment(@Param("tbdId") int tbdId, @Param("requester") String requester);
	
}
