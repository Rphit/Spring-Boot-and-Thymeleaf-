package springboot.jpa_rest.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.jpa_rest.dao.EmployeeDao;
import springboot.jpa_rest.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao dao;
	
	
	
	@Autowired
	public EmployeeServiceImpl(EmployeeDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	@Transactional
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	@Transactional
	public Employee findEmployeeById(int theId) {
		// TODO Auto-generated method stub
		return dao.findEmployeeById(theId);
	}

	@Override
	@Transactional
	public void deleteEmployee(int theId) {
		// TODO Auto-generated method stub
	  dao.deleteEmployee(theId);
	}

	@Override
	@Transactional
	public Employee saveEmployee(Employee theEmployee) {
		// TODO Auto-generated method stub
	 return	dao.saveEmployee(theEmployee);
	}

}
