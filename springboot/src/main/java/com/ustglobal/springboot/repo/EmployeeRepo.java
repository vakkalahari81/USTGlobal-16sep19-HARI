//package com.ustglobal.springboot.repo;
//
//import java.util.Date;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.ustglobal.springboot.dto.EmployeeBean;
//
//
//public interface EmployeeRepo extends JpaRepository<EmployeeBean,Integer>{
//	
//	//public EmployeeBean findByName(String name);
//	
//	@Transactional
//	@Modifying
//	@Query("update EmployeeBean set name=:name,password=:password,doj=:doj,gender=:gender")
//	public void update(String name,String password,Date doj,String gender);
//	public EmployeeBean findByName(String name);
//	public EmployeeBean deleteByName(String name);
//	
//}
