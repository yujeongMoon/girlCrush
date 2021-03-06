// 상품리스트 화면 컨트롤러 (관리자용)
// request발생시 요청을 판단해서 Model클래스로 던진다. 
// Model클래스에서 가공한 데이터를 보내주면 요청이 끝난 자료를 View(JSP)로 보낸다.
package com.example.web.controller.marketing;

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
import com.example.travelboard.model.DomesticTravel;
import com.example.travelboard.repository.DomesticTravelMapper;
import com.example.user.model.User;


@Controller
@RequestMapping("/travelboards")
public class TravelController {
	@Autowired
	private DomesticTravelMapper domesticTravelMapper;
	
	// travelboard 화면일때 Top메뉴에서 메뉴타이틀에 강조표시 해주는 역할.  
	@ModelAttribute("active")
	public String active() {
		return "travel";
	}
	
	@GetMapping()
	public ModelAndView getTravelView(
		// required : 해당파라미터가 반드시 필수인지 여부
			@RequestParam(name="page", required=false, defaultValue="1") int page,
			@RequestParam(name="size", required=false, defaultValue="10") int size,
			@RequestParam(name="bsize", required=false, defaultValue="5") int bsize){
		ModelAndView mav = new ModelAndView("board_list");
		mav.addObject("boards", domesticTravelMapper.selectByLimit(page, size));
		mav.addObject("pager", new Pager(page, size, bsize, domesticTravelMapper.count()));
		return mav;
	}
	
	@GetMapping("/view/{id}")
	public String getTravelView(@PathVariable int id, HttpSession session, Model model) {
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:/login"; // user가 null일때 login 페이지로 redirect
		}
		domesticTravelMapper.increment(id, user.getEmail());
		model.addAttribute("board", domesticTravelMapper.selectById(id));
		return "baord_view";  
	}
	
	@GetMapping("/write")
	public String postInsertView(HttpSession session, Model model) {
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:/login";
		}
		model.addAttribute("user", user);
		return "board_write";
	}
	
	@PostMapping("/write")
	public String postInsert(DomesticTravel travel, HttpSession session, Model model) {
		User user = (User) session.getAttribute("user");
		
		if(user != null && travel != null) {
			if(user.getEmail().equals(travel.getWriter())) {
				domesticTravelMapper.insert(travel);
			}
		}
		return "redirect:/travelboards";
	}
	
	@GetMapping("/update/{id}")
	public String getUpdateView(@PathVariable int id, HttpSession session, Model model) {
		User user = (User) session.getAttribute("user");
		DomesticTravel travel = domesticTravelMapper.selectById(id);
		
		if(user != null && travel != null) {
			if(user.getEmail().equals(travel.getWriter())) {
				model.addAttribute("travel", travel);
				return "board_update";
			}
		}
		return "redirect:/travelboards";
	}
	
	@PostMapping("/update")
	public String postUpdate(DomesticTravel travel, HttpSession session, Model model) {
		User user = (User) session.getAttribute("user");
		
		if(user != null && travel != null) {
			if (user.getEmail().equals(travel.getWriter())) {
				domesticTravelMapper.update(travel);
				return "redirect:/travelboards/view/" + travel.getTbdId();
			}
		}
		return "redirect:/travelboards";
	}
	
	@GetMapping("/delete/{id}")
	public String getDelete(@PathVariable int id, HttpSession session, Model model) {
		User user = (User) session.getAttribute("user");
		
		if(user != null) {
			DomesticTravel travel = domesticTravelMapper.selectById(id);
			
			if(user.getEmail().equals(travel.getWriter())) {
				domesticTravelMapper.delete(id);
			}
		}
		return "redirect:/travelboards";
	}
	
	
}
