package com.app.dao;

import java.util.List;

import com.app.model.AxEmployee;


public interface IAxEmployeeDao {
	public int saveAxEmployee(AxEmployee axEmp);
	public List<AxEmployee> getAllAxEmployee();
	public void deleteAxEmployeeById(int axEmpId);
	public AxEmployee getAxEmpById(int axEmpId);

}
