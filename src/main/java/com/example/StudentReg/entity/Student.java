package com.example.StudentReg.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

 
@Document(collection ="students")
public class Student {
 
    @Id
    private String _id;
    private String name;
    private String dob;
    private String classn;
    private String division;
    private String gender;
    
	public Student(String _id, String name, String dob, String classn, String division, String gender) {
		super();
		this._id = _id;
		this.name = name;
		this.dob = dob;
		this.classn = classn;
		this.division = division;
		this.gender = gender;
	}

	public Student() {
		super();
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getClassn() {
		return classn;
	}

	public void setClassn(String classn) {
		this.classn = classn;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [_id=" + _id + ", name=" + name + ", dob=" + dob + ", classn=" + classn + ", division="
				+ division + ", gender=" + gender + "]";
	}


    
}