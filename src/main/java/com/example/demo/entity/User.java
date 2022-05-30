package com.example.demo.entity;

public class User {
	private Integer studentId;
	private String studentName;
	private Integer grade;
	private String homeTown;
	private Integer majorId;
	private String maojorName;
	
	public User() {
		
	}
	
	public User(Integer studentId, String studentName, Integer grade, String homeTown, Integer majorId, String maojorName) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.grade = grade;
		this.homeTown = homeTown;
		this.majorId = majorId;
		this.maojorName = maojorName;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public Integer getMajorId() {
		return majorId;
	}

	public void setMajorId(Integer majorId) {
		this.majorId = majorId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getHomeTown() {
		return homeTown;
	}

	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}

	public String getMaojorName() {
		return maojorName;
	}

	public void setMaojorName(String maojorName) {
		this.maojorName = maojorName;
	}

	public String getUserInfo() {
		String result = "";
		String tn = "、";
		
		result += studentId;
		result += tn + studentName;
		result += tn + grade;
		result += tn + homeTown;
		result += tn + majorId;
		result += tn + maojorName;
		
		return result;
	}
}
