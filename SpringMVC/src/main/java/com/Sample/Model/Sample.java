package com.Sample.Model;

public class Sample {
	private int sId;
	private String sName;
	
	
	public Sample(int sId, String sName) {
		super();
		this.sId = sId;
		this.sName = sName;
	}
	
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
}
