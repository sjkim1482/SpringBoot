//package com.example.demo.emp.repository;
//
//
//import java.util.List;
//import java.util.Optional;
//
//import javax.annotation.Resource;
//
//import org.mybatis.spring.SqlSessionTemplate;
//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.stereotype.Repository;
//
//import com.example.demo.emp.model.EmpVo;
//import com.example.demo.emp.model.PageVo;
//
//
//@Repository
//public class EmpDao implements EmpDaoI{
//
//	@Resource(name = "sqlSessionTemplate")
//	private SqlSessionTemplate template;
//	
//	@Override
//	public List<EmpVo> selectAllEmployee() {
//		return template.selectList("emp.selectAllEmployee");
//	}
//
//	@Override
//	public int updateEmp(EmpVo empVo) {
//		// TODO Auto-generated method stub
//		return template.update("emp.updateEmp",empVo);
//	}
//
//	@Override
//	public int insertEmp(EmpVo empVo) {
//		// TODO Auto-generated method stub
//		return template.update("emp.insertEmp",empVo);
//	}
//
////	@Override
////	public int deleteEmp(EmpVo empVo) {
////		// TODO Auto-generated method stub
////		return template.update("emp.deleteEmp",empVo);
////	}
//
//	@Override
//	public List<EmpVo> selectPagingEmployee(PageVo pageVo) {
//		// TODO Auto-generated method stub
//		return template.selectList("emp.selectPagingEmployee", pageVo);
//	}
//
//	@Override
//	public int selectAllEmpCount() {
//		// TODO Auto-generated method stub
//		return template.selectOne("emp.selectAllEmpCount");
//	}
//
//	@Override
//	public List<EmpVo> findAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<EmpVo> findAll(Sort sort) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<EmpVo> findAllById(Iterable<Integer> ids) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <S extends EmpVo> List<S> saveAll(Iterable<S> entities) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void flush() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public <S extends EmpVo> S saveAndFlush(S entity) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <S extends EmpVo> List<S> saveAllAndFlush(Iterable<S> entities) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void deleteAllInBatch(Iterable<EmpVo> entities) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void deleteAllInBatch() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public EmpVo getOne(Integer id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public EmpVo getById(Integer id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <S extends EmpVo> List<S> findAll(Example<S> example) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <S extends EmpVo> List<S> findAll(Example<S> example, Sort sort) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Page<EmpVo> findAll(Pageable pageable) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <S extends EmpVo> S save(S entity) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Optional<EmpVo> findById(Integer id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public boolean existsById(Integer id) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public long count() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public void deleteById(Integer id) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void delete(EmpVo entity) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void deleteAllById(Iterable<? extends Integer> ids) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void deleteAll(Iterable<? extends EmpVo> entities) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void deleteAll() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public <S extends EmpVo> Optional<S> findOne(Example<S> example) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <S extends EmpVo> Page<S> findAll(Example<S> example, Pageable pageable) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <S extends EmpVo> long count(Example<S> example) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public <S extends EmpVo> boolean exists(Example<S> example) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//	
//}
