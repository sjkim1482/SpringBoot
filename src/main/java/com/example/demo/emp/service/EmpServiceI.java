package com.example.demo.emp.service;

import java.util.List;
import java.util.Map;

import com.example.demo.emp.model.EmpVo;
import com.example.demo.emp.model.PageVo;

public interface EmpServiceI {
	
	List<EmpVo> selectAllEmployee();
	
	int updateEmp(EmpVo empVo);
	
	int insertEmp(EmpVo empVo);
	
	int deleteEmp(EmpVo empVo);
	
	Map<String, Object> selectPagingEmployee(PageVo pageVo);
	
}
