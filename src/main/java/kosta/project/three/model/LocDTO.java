package kosta.project.three.model;

public class LocDTO {
	
	private String loc_code,loc_name;
	
	public LocDTO() {
		// TODO Auto-generated constructor stub
	}

	public LocDTO(String loc_code, String loc_name) {
		
		this.loc_code = loc_code;
		this.loc_name = loc_name;
	}

	public String getLoc_code() {
		return loc_code;
	}

	public void setLoc_code(String loc_code) {
		this.loc_code = loc_code;
	}

	public String getLoc_name() {
		return loc_name;
	}

	public void setLoc_name(String loc_name) {
		this.loc_name = loc_name;
	}
	
	

}
