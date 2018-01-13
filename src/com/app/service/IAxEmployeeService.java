package com.app.service;

import java.util.List;

import com.app.model.AxEmployee;

public interface IAxEmployeeService {
	public int saveAxEmployee(AxEmployee axEmp);
	public List<AxEmployee> getAllAxEmployee();
	public void deleteAxEmployeeById(int axEmpId);
	public AxEmployee getAxEmpById(int axEmpId);

}
