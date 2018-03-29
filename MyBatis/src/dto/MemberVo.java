package dto;
/*
CREATE TABLE MEMBERVO(
		ID VARCHAR2(50) NOT NULL,
		PWD VARCHAR2(50) NOT NULL,
		EMAIL VARCHAR2(50) NOT NULL,
		PHONE VARCHAR2(50) NOT NULL
	)
*/
public class MemberVo {

	private String id;
	private String pwd;
	private String email;
	private String phone;
	
	public MemberVo() {}

	public MemberVo(String id, String pwd, String email, String phone) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "MemberVo [id=" + id + ", pwd=" + pwd + ", email=" + email + ", phone=" + phone + "]";
	}
	
	
	
}
