package kosta.project.three.model;

import java.sql.SQLException;
import java.util.List;

import kosta.project.three.dto.AdminUserListDTO;

public interface AdminUserListDAO {
	
	public int getCount(String field, String query) throws ClassNotFoundException, SQLException;
	
	public List<AdminUserListDTO> getAdminUserList(int page, String field, String query) throws ClassNotFoundException, SQLException;
	
	public int update(AdminUserListDTO adminUserList) throws ClassNotFoundException, SQLException;
	
}
