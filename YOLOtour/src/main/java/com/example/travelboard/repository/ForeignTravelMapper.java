// 조가희 : 외국여행상품화면  Mapper interface (DAO)
// DAO : 데이터베이스에 접근해서 작업을 하는 부분만을 소유한 클래스.
package com.example.travelboard.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.travelboard.model.ForeignTravel;

// 마이바티스가 인터페이스 구현클래스를 만들어서 스프링에게 제공한다.
@Mapper
public interface ForeignTravelMapper {
	public int insert(ForeignTravel travel);
	public int update(ForeignTravel travel);
	public int delete(int tbfId);
	
	@Select("SELECT COUNT(*) FROM TRAVEl_BOARD_FOREIGN") //pager에서 쓰기때문에 필요.
	public int count();
	
	@Select("SELECT * FROM TRAVEL_BOARD_FOREIGN ORDER BY TBF_ID DESC")
	public List<ForeignTravel> selectAll();
	
	public ForeignTravel selectById(int tbfId);
	public List<ForeignTravel> selectByLimit(@Param("page") int page, @Param("size") int size);
	public int increment(@Param("tbfId") int tbfId, @Param("requester") String requester);
	
}
