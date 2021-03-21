package com.satya.springboot.mongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Students")
public class Student {
	
	@Id
	private String studentId;
	private String studentName;
	private String studentAddress;
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	@Override
	  public String toString() {
	    return "Student Details {" + "id=" + this.studentId + ", name='" + this.studentName + '\'' + ", role='" + this.studentAddress + '\'' + '}';
	  }

}
