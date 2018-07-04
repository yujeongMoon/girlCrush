package com.example.noticeboard.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.noticeboard.model.Notice;

@Mapper
public interface NoticeMapper {
	public int insert(Notice notice);
	public int update(Notice notice);
	public int delete(long id);
	
	@Select("SELECT COUNT(*) FROM NOTICE_BOARD")
	public int count();
	
	@Select("SELECT * FROM NOTICE_BOARD ORDER BY id DESC")
	public List<Notice> selectAll();
	
	public Notice selectById(long id);
	public List<Notice> selectLimit(@Param("page") int page, @Param("size") int size);
	public int increment(@Param("id") long id, @Param("requester") String requester);	
}
