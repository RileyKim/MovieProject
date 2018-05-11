package kosta.project.three.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kosta.project.three.model.LocDTO;
import kosta.project.three.model.RvDAO;



@Controller
public class RvController {
	
	@Resource
	private RvDAO rvdao;
	
	@RequestMapping("/loc.do")
	public String loc(Model model) {
		List<LocDTO> list = rvdao.getLocList();
		model.addAttribute("list", list);
		return "loc";
	}
	
	@RequestMapping("index.do")
	public String index() {
		return "index";
	}

}
