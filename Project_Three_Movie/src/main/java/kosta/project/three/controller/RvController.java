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


//테스트
@Controller
public class RvController {
	
	@Resource
	private RvDAO rvdao;
	
	//��ȭ������ ���������������� ����
	@RequestMapping(value ="/loc_select.do")
	public String loc(@RequestParam("movie_code")String movie_code, Model model) {
		model.addAttribute("movie_code", movie_code); //Ŭ���� ��ȭ�ڵ� ����
		
		List<LocDTO> list = rvdao.getLocList();
		model.addAttribute("list", list);
		return "loc_select";
		
	}
	
	//���������� ��¥������������ ����
	@RequestMapping(value="/date_select.do")	
	public String time(@RequestParam("movie_code")String movie_code,
			@RequestParam("loc_code")String loc_code, Model model) {
		
		String loc_name = rvdao.getLocName(loc_code);
		model.addAttribute("movie_code", movie_code);
		model.addAttribute("loc_name", loc_name);
		model.addAttribute("loc_code", loc_code);
		return "date_select";
	}
	
	//����ù��°������
	@RequestMapping("/reservation.do")
	public String movie_select() {
		return "reservation";
	}

}
