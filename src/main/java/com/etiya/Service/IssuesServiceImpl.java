package com.etiya.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

import com.etiya.Repositories.IssuesRepository;

import com.etiya.entities.Issues;

@Service
@Transactional
public class IssuesServiceImpl implements IssuesService {

	@Autowired
	IssuesRepository issuesRepository;
	
	@Override
	public List<Issues> getAllIssues() {
		
		return issuesRepository.findAll();
	}

	@Override
	public void saveOrUpdate(Issues issues) {
		// TODO Auto-generated method stub
		issuesRepository.save(issues);
	}

}
