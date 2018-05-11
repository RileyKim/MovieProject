package kosta.project.three.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

	@RequestMapping("adminEvent.do")
	public String adminEventController() {
		
		return "adminEvent";
	}
	@RequestMapping("/adminMovie.do")
	public String adminMovieController() {
		
		return "adminMovie";
	}
	@RequestMapping("/adminQuestion.do")
	public String adminQuestionController() {
		
		return "adminQuestion";
	}
	@RequestMapping("/adminUserList.do")
	public String adminUserController() {
		
		return "adminUserList";
	}
}
