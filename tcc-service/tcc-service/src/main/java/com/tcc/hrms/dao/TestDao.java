package com.tcc.hrms.dao;

import org.springframework.stereotype.Component;

import com.tcc.hrms.dto.TestDTO;

@Component
public class TestDao {

	public TestDTO test(int id) {
		TestDTO testDTO = new TestDTO();
		testDTO.setId(id);
		testDTO.setName("Test");
		return testDTO;
	}
}
