package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="AxEmployee")
public class AxEmployee {
	
	@Id
	@Column(name="eid")
	@GeneratedValue ( strategy = GenerationType.AUTO)
	private int axEmpId;
	
	@Column(name="ename")
	private String axEmpName;
	
	@Column(name="eemail")
	private String axEmpEmail;
	
	@Column(name="eloc")
	private String axEmpLoc;
	
	@Column(name="etype")
	private String axEmpType;
	
	@Column(name="egender")
	private String axEmpGender;

	public AxEmployee() {
		super();
	}

	public int getAxEmpId() {
		return axEmpId;
	}

	public void setAxEmpId(int axEmpId) {
		this.axEmpId = axEmpId;
	}

	public String getAxEmpName() {
		return axEmpName;
	}

	public void setAxEmpName(String axEmpName) {
		this.axEmpName = axEmpName;
	}

	public String getAxEmpEmail() {
		return axEmpEmail;
	}

	public void setAxEmpEmail(String axEmpEmail) {
		this.axEmpEmail = axEmpEmail;
	}

	public String getAxEmpLoc() {
		return axEmpLoc;
	}

	public void setAxEmpLoc(String axEmpLoc) {
		this.axEmpLoc = axEmpLoc;
	}

	public String getAxEmpType() {
		return axEmpType;
	}

	public void setAxEmpType(String axEmpType) {
		this.axEmpType = axEmpType;
	}

	public String getAxEmpGender() {
		return axEmpGender;
	}

	public void setAxEmpGender(String axEmpGender) {
		this.axEmpGender = axEmpGender;
	}

	@Override
	public String toString() {
		return "AxEmployee [axEmpId=" + axEmpId + ", axEmpName=" + axEmpName
				+ ", axEmpEmail=" + axEmpEmail + ", axEmpLoc=" + axEmpLoc
				+ ", axEmpType=" + axEmpType + ", axEmpGender=" + axEmpGender
				+ "]";
	}
	
	
	

}
