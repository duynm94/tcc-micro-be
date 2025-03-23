package com.tcc.hrms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcc.hrms.dao.TestDao;
import com.tcc.hrms.dto.TestDTO;
//import com.tcc.hrms.repository.TestRepository;

@Service
public class TestService {

	@Autowired
    private TestDao testDao;
	
	//@Autowired
	//private TestRepository repository;

	public TestDTO test(int id) {
		return testDao.test(id);
	}

}
