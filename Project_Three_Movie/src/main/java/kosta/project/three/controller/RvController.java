package kosta.project.three.controller;

import java.util.List;

import javax.annotation.Resource;

import org.junit.runner.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kosta.project.three.model.LocDTO;
import kosta.project.three.model.RvDAO;



@Controller
public class RvController {
	
	@Resource
	private RvDAO rvdao;
	
	//영화선택후 지역선택페이지로 갈때
	@RequestMapping(value ="/loc_select.do")
	public String loc(@RequestParam("movie_code")String movie_code, Model model) {
		model.addAttribute("movie_code", movie_code); //클릭한 영화코드 받음
		
		List<LocDTO> list = rvdao.getLocList();
		model.addAttribute("list", list);
		return "loc_select";
		
	}
	
	//지역선택후 날짜선택페이지로 갈때
	@RequestMapping(value="/date_select.do")	
	public String time(@RequestParam("movie_code")String movie_code,
			@RequestParam("loc_code")String loc_code, Model model) {
		
		String loc_name = rvdao.getLocName(loc_code);
		model.addAttribute("movie_code", movie_code);
		model.addAttribute("loc_name", loc_name);
		model.addAttribute("loc_code", loc_code);
		return "date_select";
	}
	
	//예매첫번째페이지
	@RequestMapping("/reservation.do")
	public String movie_select() {
		return "reservation";
	}

}
