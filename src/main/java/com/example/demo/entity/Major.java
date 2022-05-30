package com.example.demo.entity;

public class Major {
	private Integer majorId;
	private String maojorName;
	
	public Major() {
		
	}
	
	public Major(Integer majorId, String maojorName) {
		this.majorId = majorId;
		this.maojorName = maojorName;
	}

	public Integer getMajorId() {
		return majorId;
	}

	public void setMajorId(Integer majorId) {
		this.majorId = majorId;
	}

	public String getMaojorName() {
		return maojorName;
	}

	public void setMaojorName(String maojorName) {
		this.maojorName = maojorName;
	}
	
	public String getMajorInfo() {
		String result = "";
		String tn = "、";
		
		
		result += majorId;
		result += tn + maojorName;
		
		return result;
	}
}
