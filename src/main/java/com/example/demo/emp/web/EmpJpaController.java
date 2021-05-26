package com.example.demo.emp.web;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.emp.model.EmpVo;
import com.example.demo.emp.repository.EmpDaoI;
import com.example.demo.user.UserNotFoundException;

@RestController
@RequestMapping("/emp")
public class EmpJpaController {
	@Autowired
	private EmpDaoI empDaoI;
	
	@GetMapping("/jpa/emps")
	public List<EmpVo> selectAllEmployee(){
		return empDaoI.findAll();
	}
	
	@GetMapping("/jpa/emp/{emp_no}")
	public EmpVo selectEmp(@PathVariable int emp_no) {
		Optional<EmpVo> empVo = empDaoI.findById(emp_no);
		
		if(!empVo.isPresent()) {
			throw new UserNotFoundException(String.format("ID{%s} not found",emp_no));
		}
		
		return empVo.get();
	}
	
	@DeleteMapping("/jpa/emp/deleteEmp/{emp_no}")
	public void deleteEmp(@PathVariable int emp_no) {
		empDaoI.deleteById(emp_no);
	}
	
//	@PostMapping("/jpa/emp/registEmp/{emp_no}")
//	public ResponseEntity<EmpVo> createEmp(@PathVariable EmpVo empVo){
//		EmpVo saveEmpVo = empDaoI.save(empVo);
////		URI location = ServletUriComponentsBuilder
//	
//	}
	
	
	
}
