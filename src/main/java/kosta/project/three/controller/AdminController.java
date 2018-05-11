package kosta.project.three.controller;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kosta.project.three.dto.AdminUserListDTO;
import kosta.project.three.model.AdminUserListDAO;

@Controller
public class AdminController {

	@Autowired
	private SqlSession SqlSession;
	
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
	public String adminUserController(String pg, String f, String q, Model model) throws ClassNotFoundException, SQLException {
		
		int page = 1;
		String field = "Title";
		String query = "%%";
		
		if(pg != null && pg.equals("")) {
			page = Integer.parseInt(pg);
		}
		if(f !=null && pg.equals("")) {
			field = f;
		}
		if(q != null && q.equals("")) {
			query = q;
		}
		
		AdminUserListDAO adminUserListDAO = SqlSession.getMapper(AdminUserListDAO.class);
		
		List<AdminUserListDTO> list = adminUserListDAO.getAdminUserList(page, field, query);
		
		model.addAttribute("list",list);
		
		
		return "adminUserList";
	}
}
