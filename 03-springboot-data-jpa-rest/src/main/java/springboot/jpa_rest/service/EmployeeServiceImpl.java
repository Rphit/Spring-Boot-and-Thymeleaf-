package springboot.jpa_rest.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.jpa_rest.dao.EmployeeRepositoryDAO;
import springboot.jpa_rest.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepositoryDAO employeeRepositoryDAO;
	
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepositoryDAO employeeRepositoryDAO) {
		super();
		this.employeeRepositoryDAO = employeeRepositoryDAO;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepositoryDAO.findAll();
		}

	@Override
	public Optional<Employee> findEmployeeById(int theId) {
		// TODO Auto-generated method stub
		Optional<Employee> emOptional=employeeRepositoryDAO.findById(theId);
		if(emOptional.isPresent())
		{
			
		}
		return emOptional;
	}

	@Override
	public void deleteEmployee(int theId) {
		// TODO Auto-generated method stub
		 employeeRepositoryDAO.deleteById(theId);
	}

	@Override
	public Employee saveEmployee(Employee theEmployee) {
		// TODO Auto-generated method stub
		return employeeRepositoryDAO.saveAndFlush(theEmployee);
	}

	
	
	
	
	

}
