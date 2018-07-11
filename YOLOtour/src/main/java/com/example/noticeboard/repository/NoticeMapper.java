package com.example.noticeboard.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.noticeboard.model.Notice;
import com.example.travelboard.model.DomesticTravel;

@Mapper
public interface NoticeMapper {
	public int insert(Notice notice);
	public int update(Notice notice);
	public int delete(long noticeId);
	
	@Select("SELECT COUNT(*) FROM NOTICE_BOARD")
	public int count();
	
	@Select("SELECT * FROM NOTICE_BOARD ORDER BY notice_id DESC")
	public List<Notice> selectAll();
<<<<<<< HEAD
	
	@Select("SELECT * FROM travel_board where id = 1")
	public List<DomesticTravel> selectByLimit_travel();
	
	public Notice selectById(long id);
=======

	public Notice selectById(long noticeId);
>>>>>>> d8e9d7b5bdc9d6c374f1f83203290f7774632f96
	public List<Notice> selectByLimit(@Param("page") int page, @Param("size") int size);
	
	public int increment(@Param("noticeId") long noticeId, @Param("requester") String requester);	
}
