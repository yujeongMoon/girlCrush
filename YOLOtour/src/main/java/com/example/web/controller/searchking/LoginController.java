package com.example.web.controller.searchking;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.login.dto.Login;
import com.example.login.service.LoginService;
import com.example.user.model.User;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@ModelAttribute("active")
	public String active(){
		return "login";
	}
	
	@GetMapping("/login")
	public String showLoginForm() {
		return "login";
	}
	
	@PostMapping("/login")
	public String postLogin(Login login, Model model, HttpSession session) {
		loginService.authenticate(login);
		
		if (login.getError() != null) {
			model.addAttribute("error", login.getError());
			model.addAttribute("login", login);
			return "login";
		} else { 
			User user = new User(login.getEmail(), login.getPassword(), 0);
			session.setAttribute("user", user);
			return "redirect:/";
		}
	}       
	
	@GetMapping("/logout")
	public String getLogout(HttpSession session) {
		session.invalidate();
		return "login";
	}
}
