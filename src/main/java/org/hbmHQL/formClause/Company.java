package org.hbmHQL.formClause;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Company {

	@SequenceGenerator(name="hbm_Company_id_generator", sequenceName="db_Company_id_generator",initialValue=500, allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="hbm_Company_id_generator")
	@Id @Column(name="COMP_ID")
	private Integer compId;
	
	@Column(name="COMP_NAME")
	private String compName;
	
	@Column(name="COMP_LOCATION")
	private String compLocation;
	
	@OneToMany(mappedBy="company")
	/*@JoinTable(name="COMP_EMP",
		joinColumns=@JoinColumn(name="COMPANY_ID"),
		inverseJoinColumns=@JoinColumn(name="EMPLOYEE_ID"))*/
	Collection<Employee> empList = new ArrayList<Employee> ();
	
	
	
	public Collection<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(Collection<Employee> empList) {
		this.empList = empList;
	}

	public Integer getCompId() {
		return compId;
	}
	
	public void setCompId(Integer compId) {
		this.compId = compId;
	}
	
	public String getCompName() {
		return compName;
	}
	
	public void setCompName(String compName) {
		this.compName = compName;
	}
	
	public String getCompLocation() {
		return compLocation;
	}
	
	public void setCompLocation(String compLocation) {
		this.compLocation = compLocation;
	}
	
}
