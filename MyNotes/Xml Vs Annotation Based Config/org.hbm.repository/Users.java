package org.hbm.repository;



public class Users {

	private Integer userId ;
	private String userUsername ;
	private String userFname ;
	private String userLname ;
	private String userJobTitle ;
	private String userEmail ;
	private Integer userGenderId;
	
	public Users() {
	}
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserUsername() {
		return userUsername;
	}
	public void setUserUsername(String userUsername) {
		this.userUsername = userUsername;
	}
	public String getUserFname() {
		return userFname;
	}
	public void setUserFname(String userFname) {
		this.userFname = userFname;
	}
	public String getUserLname() {
		return userLname;
	}
	public void setUserLname(String userLname) {
		this.userLname = userLname;
	}
	public String getUserJobTitle() {
		return userJobTitle;
	}
	public void setUserJobTitle(String userJobTitle) {
		this.userJobTitle = userJobTitle;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Integer getUserGenderId() {
		return userGenderId;
	}
	public void setUserGenderId(Integer userGenderId) {
		this.userGenderId = userGenderId;
	}
}
