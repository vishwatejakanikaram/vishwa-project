package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IAxEmployeeDao;
import com.app.model.AxEmployee;


@Repository
public class AxEmployeeDaoImpl implements IAxEmployeeDao {

	@Autowired
	private HibernateTemplate ht;

	
	@Override
	public int saveAxEmployee(AxEmployee axEmp) {
		return (Integer)ht.save(axEmp);
	}

	@Override
	public List<AxEmployee> getAllAxEmployee() {
		
		return ht.loadAll(AxEmployee.class);
	}

	@Override
	public void deleteAxEmployeeById(int axEmpId) {
		AxEmployee axEmp = new AxEmployee();
		axEmp.setAxEmpId(axEmpId);
		ht.delete(axEmp);
		/*ht.delete(new Location(locId));*/

	}

	@Override
	public AxEmployee getAxEmpById(int axEmpId) {
		
		return ht.get(AxEmployee.class,axEmpId);
	}

}
