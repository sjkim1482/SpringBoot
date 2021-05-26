//package com.example.demo.emp.web;
//
//import java.util.List;
//
//import javax.annotation.Resource;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.emp.model.EmpVo;
//import com.example.demo.emp.model.PageVo;
//import com.example.demo.emp.service.EmpService;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//@RestController
//@RequestMapping("emp")
//public class EmpController {
//
//	private static final Logger logger = LoggerFactory.getLogger(EmpController.class);
//	
//	@Resource(name="empService")
//	private EmpService empService;
//	
//	@GetMapping(path = "selectEmpList")
//	public List<EmpVo> selectEmpList(Model model) {
//		
//		logger.debug("접속");
//		
//		model.addAttribute("empList", empService.selectAllEmployee());
//		
//		return empService.selectAllEmployee();
//	}
//	
//	@RequestMapping(path = "updateEmp")
//	public String updateEmp(EmpVo empVo, Model model) {
//		
//		logger.debug("empVo : {}", empVo);
//		
//		int update = empService.updateEmp(empVo);
//		
//		model.addAttribute("updateCnt", update);
//		
//		
//		return "jsonView";
//	}
//	
//	@RequestMapping(path = "insertEmp")
//	public String insertEmp(EmpVo empVo, Model model) {
//		
//		logger.debug("empVo : {}", empVo);
//		
//		int insert = empService.insertEmp(empVo);
//		
//		model.addAttribute("insertCnt", insert);
//		
//		
//		return "jsonView";
//	}
//	
//	@RequestMapping(path = "deleteEmp")
//	public String deleteEmp(EmpVo empVo, Model model) {
//		
//		logger.debug("empVo : {}", empVo);
//		
//		int delete = empService.deleteEmp(empVo);
//		
//		model.addAttribute("deleteCnt", delete);
//		
//		
//		return "jsonView";
//	}
//	
//	@RequestMapping(path = "selectPagingEmployee")
//	public String selectPagingEmployee(PageVo pageVo, Model model) {
//		
//		logger.debug("접속");
//		
//		model.addAllAttributes(empService.selectPagingEmployee(pageVo));
//		
//		return "jsonView";
//	}
//	
//}
