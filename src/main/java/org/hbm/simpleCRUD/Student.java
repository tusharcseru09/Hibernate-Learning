package org.hbm.simpleCRUD;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity
@Table(name="STUDENTS")
public class Student {
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Integer Id;
	
	@Column(name="FIRSTNAME")
	private String fName;
	
	@Column(name="LASTNAME")
	private String lName;
	
	@Column(name="BIRTHDATE")
	private Date dob;
	
	@Column(name="ROLLNUMBER")
	private Integer rollNumber;
	
	public Student() {}
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Integer getsRoll() {
		return rollNumber;
	}
	public void setsRoll(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	
	
	
	
	

}
