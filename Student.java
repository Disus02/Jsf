package com.song.jsf.example;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String lastname;
	private Date birthday;

	public Student() {}
	public Student(Long id, String name,String lastname,Date birthday) {
		this.id = id;
		this.name = name;
		this.lastname=lastname;
		this.birthday=birthday;
	}

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public Student clone() {
		return new Student(id, name,lastname,birthday);
	}

	public void restore(Student student) {
		this.birthday=student.getBirthday();
		this.id = student.getId();
		this.name = student.getName();
		this.lastname=student.getLastname();
	}
}
