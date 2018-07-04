// 조가희 : 여행상품화면  Mapper interface
package com.example.travelboard.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.travelboard.model.Travel;

// 마이바티스가 인터페이스 구현클래스를 만들어서 스프링에게 제공한다.
@Mapper
public interface TravelMapper {
	public int insert(Travel travel);
	public int update(Travel travel);
	public int delete(long id);
	
	@Select("SELECT COUNT(*) FROM travel_board")
	public int count();
	
	@Select("SELECT * FROM travel_board ORDER BY id DESC")
	public List<Travel> selectAll();
	
	public Travel selectById(long id);
	public List<Travel> selectByLimit(@Param("page") int page, @Param("size") int size);
	public int imcrement(@Param("id") long id, @Param("requester") String requester);
	
}
