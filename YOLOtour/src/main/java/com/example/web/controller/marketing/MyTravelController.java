package com.example.web.controller.marketing;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/*
 * 	메뉴				href				요청방식		 파라미터			데이터			리턴/뷰
 *  travel			/travel				GET
 *  
 */

@Controller
public class MyTravelController {

//	@RequestMapping(method=RequestMethod.GET)
	@GetMapping("/travel")
	public String get1() {
		return "redirect:/domestic";
	}

}
