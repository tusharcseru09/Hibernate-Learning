package org.hbm.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="USER_DETAILS")
public class UserDetails {
	
	@Id @Column(name="USER_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userId;
	
	@Column(name="USER_NAME")
	private String userName;

	@OneToOne
	@JoinColumn(name="ADDRESS_ID")
	private UserAddress userAdd;

	public UserAddress getUserAdd() {
		return userAdd;
	}

	public void setUserAdd(UserAddress userAdd) {
		this.userAdd = userAdd;
	}

	public Long getUserId() {
		return userId;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
