/*package org.hbm.repository;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name="USERS")
public class Users {

	@Id 
	@GeneratedValue
	@Column(name="USER_ID")
	private Integer userId ;
	
	@Column(name="USER_USERNAME")
	private String userUsername ;
	
	@Column(name="USER_FNAME")
	private String userFname ;
	
	@Column(name="USER_LNAME")
	private String userLname ;
	
	@Column(name="USER_JOB_TITLE")
	private String userJobTitle ;
	
	@Column(name="USER_EMAIL")
	private String userEmail ;
	
	@Column(name="USER_GENDER_ID")
	private Integer userGenderId;
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="USER_ID")
	private Set<PhoneNumber> phoneNumbers;
	
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




	public Set<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}




	public void setPhoneNumbers(Set<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	
	
	
	
	
	
}
*/