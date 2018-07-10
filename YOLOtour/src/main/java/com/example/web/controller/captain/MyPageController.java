package com.example.web.controller.captain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.Pager;
import com.example.noticeboard.repository.NoticeMapper;

@Controller
@RequestMapping("/mypage")
public class MyPageController {
	@Autowired
	private NoticeMapper noticeMapper;
	
	@GetMapping()
	public ModelAndView getMypageView(
			@RequestParam(name="page", required=false, defaultValue="1") int page,
			@RequestParam(name="size", required=false, defaultValue="10") int size,
			@RequestParam(name="bsize", required=false, defaultValue="5") int bsize) {
		ModelAndView mav = new ModelAndView("my_page");
		mav.addObject("mypageB", noticeMapper.selectByLimit_travel());
		mav.addObject("pager", new Pager(page, size, bsize, noticeMapper.count()));
		return mav;
	}
}
