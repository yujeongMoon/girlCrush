package com.example.web.controller.marketing;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.travelboard.model.DomesticTravel;
import com.example.travelboard.repository.DomesticTravelMapper;

/*
 * 	메뉴				href					요청방식			 파라미터			데이터			리턴/뷰
 *  domestic		/domestic				GET				page			rownum 쿼리		board_list.jsp
 *  
 */

@Controller
@RequestMapping("/domestic")
public class MyDomesticTravelController {
	@Autowired
	private DomesticTravelMapper domesticTravelMapper;
	
	@RequestMapping(method=RequestMethod.GET)
	public String get1(
			@RequestParam(value="page", required=false, defaultValue="1") int page,
			@RequestParam(value="size", required=false, defaultValue="20") int size,
			Model model) {
		List<DomesticTravel> domesticTravels = domesticTravelMapper.selectByLimit(page, size);
		model.addAttribute("boards", domesticTravels);
		return "board_list";
	}

}
