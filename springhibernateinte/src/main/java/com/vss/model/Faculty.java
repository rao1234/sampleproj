package com.vss.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="faculty_mst_tbl")
public class Faculty {
	
	@Id
	@Column(name="facultyid")
	private int fid;
	@Column(name="facultyname")
	private String fname;
	private String fcourse;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFcourse() {
		return fcourse;
	}
	public void setFcourse(String fcourse) {
		this.fcourse = fcourse;
	}
	@Override
	public String toString() {
		return "Faculty [fid=" + fid + ", fname=" + fname + ", fcourse=" + fcourse + "]";
	}
	

}
