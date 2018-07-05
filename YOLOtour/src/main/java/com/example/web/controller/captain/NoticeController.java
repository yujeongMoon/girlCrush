package com.example.web.controller.captain;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.Pager;
import com.example.noticeboard.model.Notice;
import com.example.noticeboard.repository.NoticeMapper;
import com.example.user.model.User;

@Controller
@RequestMapping("/notices")
public class NoticeController {
	@Autowired
	private NoticeMapper noticeMapper;
	
	@ModelAttribute("active")
	public String active() {
		return "notice";
	} 

	@GetMapping()
	public ModelAndView getNoticesView(
			@RequestParam(name="page", required=false, defaultValue="1") int page,
			@RequestParam(name="size", required=false, defaultValue="10") int size,
			@RequestParam(name="bsize", required=false, defaultValue="5") int bsize) {
		ModelAndView mav = new ModelAndView("notice_list");
//		mav.addObject("notices", noticeMapper.selectLimit(page, size));
		mav.addObject("pager", new Pager(page, size, bsize, noticeMapper.count()));
		return mav;
	}
	
	@GetMapping("/view/{id}")
	public String getNoticeView(@PathVariable long id, HttpSession session, Model model) {
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:/login";
		}
		
		noticeMapper.increment(id, user.getEmail());
		model.addAttribute("notice", noticeMapper.selectById(id));
		return "notice_view";
	}
	
	@GetMapping("/write")
	public String getInsertView(HttpSession session, Model model) {
		User user = (User) session.getAttribute("user");

		if(user == null) {
			return "redirect:/login";
		}
		model.addAttribute("user",user);
		return "notice_write";
	}
	
	@PostMapping("/write")
	public String postInsert(Notice notice, HttpSession session, Model model) {
		User user = (User) session.getAttribute("user");
		
		if(user != null && notice != null) {
			if(user.getEmail().equals(notice.getWriter())) {
				noticeMapper.insert(notice);
			}
		}
		return "redirect:/notices";
	}
	
	@GetMapping("/update/{id}")
	public String getUpdateView(@PathVariable long id, HttpSession session, Model model ) {
		User user = (User) session.getAttribute("user");
		Notice notice = noticeMapper.selectById(id);
		
		if(user != null && notice != null) {
			if(user.getEmail().equals(notice.getWriter())) {
				model.addAttribute("notice", notice);
				return "notice_update";
			}
		}
		return "redirect:/notices";
	}
	
	@PostMapping("/update")
	public String postUpdate(Notice notice, HttpSession session, Model model) {
		User user = (User) session.getAttribute("user");
		
		if(user != null && notice != null) {
			if(user.getEmail().equals(notice.getWriter())) {
				noticeMapper.update(notice);
				return "redirect:/notices/view/" + notice.getId();
			}
		}
		return "redirect:/notices";
	}
	
	@GetMapping("/delete/{id}")
	public String getDelete(@PathVariable long id, HttpSession session, Model model) {
		User user = (User) session.getAttribute("user");
		
		if(user != null) {
			Notice notice = noticeMapper.selectById(id);
			
			if(user.getEmail().equals(notice.getWriter())) {
				noticeMapper.delete(id);
			}
		}
		return "redirect:/notices";
	}
}