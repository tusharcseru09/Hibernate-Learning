package org.hbm.main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="USER_ADDRESS")
public class UserAddress {
	
	@Id @Column(name="ADD_ID")
	@GeneratedValue
	private Long addressId;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="HOME_NO")
	private String homeNo;
	
	@OneToOne
	@JoinColumn(name="USER_ID")
	private UserDetails userDetails;
	
	
	
	
	public UserDetails getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHomeNo() {
		return homeNo;
	}
	public void setHomeNo(String homeNo) {
		this.homeNo = homeNo;
	}
	
	
	

}
