package com.anji.stu;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CourseBean implements Serializable {
	private String couCode;
	private String couTitle;
	private String couDescription;
	private int capacity;
	private String couSchedule;

	public String getCouCode() {
		return couCode;
	}

	public void setCouCode(String couCode) {
		this.couCode = couCode;
	}

	public String getCouTitle() {
		return couTitle;
	}

	public void setCouTitle(String couTitle) {
		this.couTitle = couTitle;
	}

	public String getCouDescription() {
		return couDescription;
	}

	public void setCouDescription(String couDiscription) {
		this.couDescription = couDiscription;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getCouSchedule() {
		return couSchedule;
	}

	public void setCouSchedule(String couSchedule) {
		this.couSchedule = couSchedule;
	}

}
