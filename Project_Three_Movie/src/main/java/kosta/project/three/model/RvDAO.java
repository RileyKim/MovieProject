package kosta.project.three.model;

import java.util.List;



public interface RvDAO {
	
	public List<LocDTO> getLocList();
	public String getLocName(String loc_code);

}
