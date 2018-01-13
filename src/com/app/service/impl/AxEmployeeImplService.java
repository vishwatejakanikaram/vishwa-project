package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IAxEmployeeDao;
import com.app.model.AxEmployee;
import com.app.service.IAxEmployeeService;
@Service
public class AxEmployeeImplService implements IAxEmployeeService {

	@Autowired
	private IAxEmployeeDao dao;
	
	@Override
	public int saveAxEmployee(AxEmployee axEmp) {
		return dao.saveAxEmployee(axEmp);
	}

	@Override
	public List<AxEmployee> getAllAxEmployee() {
		List<AxEmployee> axemplist=dao.getAllAxEmployee();
		 return axemplist;
	}

	@Override
	public void deleteAxEmployeeById(int axEmpId) {
	dao.deleteAxEmployeeById(axEmpId);

	}

	@Override
	public AxEmployee getAxEmpById(int axEmpId) {
	
		return dao.getAxEmpById(axEmpId);
	}

}
