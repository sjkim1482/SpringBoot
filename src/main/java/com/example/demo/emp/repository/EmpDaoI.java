package com.example.demo.emp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.emp.model.EmpVo;
import com.example.demo.emp.model.PageVo;

@Repository
public interface EmpDaoI extends JpaRepository<EmpVo, Integer> {
	
//	List<EmpVo> selectAllEmployee();
//	
//	int updateEmp(EmpVo empVo);
//	
//	int insertEmp(EmpVo empVo);
//	
////	int deleteEmp(EmpVo empVo);
//	
//	List<EmpVo> selectPagingEmployee(PageVo pageVo);
//	
//	int selectAllEmpCount();

	
}
