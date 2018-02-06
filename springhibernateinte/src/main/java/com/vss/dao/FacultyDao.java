package com.vss.dao;

import java.util.List;

import com.vss.model.Faculty;

public interface FacultyDao {
	
	public void save(Faculty f);
	
	public List<Faculty> faclist();

}
