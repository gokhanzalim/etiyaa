package com.etiya.Service;

import java.util.List;

import com.etiya.entities.Issues;
import com.etiya.entities.Product;


public interface IssuesService {

	
	public List<Issues> getAllIssues();
	
	 public void saveOrUpdate(Issues issues);
}
