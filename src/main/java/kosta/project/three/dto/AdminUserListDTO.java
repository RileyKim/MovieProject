package kosta.project.three.dto;

public class AdminUserListDTO {
	private String id;
	private String number;
	private String email;
	private int role;
	
	public AdminUserListDTO() {	}

	public AdminUserListDTO(String id, String number, String email, int role) {
		
		this.id = id;
		this.number = number;
		this.email = email;
		this.role = role;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	
	@Override
	public String toString() {
		return "AdminUserListDTO [id=" + id + ", number=" + number + ", email=" + email + ", role=" + role + "]";
	}
	
	
	
	
}
