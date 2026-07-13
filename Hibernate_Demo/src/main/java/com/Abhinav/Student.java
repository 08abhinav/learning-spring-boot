package com.Abhinav;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int sId;
	private String sName;
	private String sTech;
	
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsTech() {
		return sTech;
	}
	public void setsTech(String sTech) {
		this.sTech = sTech;
	}
	
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sTech=" + sTech + "]";
	}
	
}
