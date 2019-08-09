package springboot.jpa_rest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springboot.jpa_rest.entity.Employee;

@Repository
public class EmployeeDaoImp implements EmployeeDao {

	private EntityManager entityManager;

	// constructor injection
	@Autowired
	public EmployeeDaoImp(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method

		TypedQuery<Employee> query = entityManager.createQuery("from Employee", Employee.class);
		return query.getResultList();
	}

	public Employee findEmployeeById(int theId) {
		// Session currentSession= entityManager.unwrap(Session.class);
		Employee theEmployee = entityManager.find(Employee.class, theId);
		return theEmployee;
	}

	@Override
	public void deleteEmployee(int theId) {
		// TODO Auto-generated method stub
		// Session currentSession=entityManager.unwrap(Session.class);
		Employee theEmployee = entityManager.find(Employee.class, theId);
		entityManager.remove(theEmployee);

	}

	@Override
	public Employee saveEmployee(Employee theEmployee) {
		// TODO Auto-generated method stub
		// get current hibernate session
		Employee employee = entityManager.merge(theEmployee);

		// save/upate the customer ... finally LOL
		theEmployee.setId(employee.getId());
		return employee;

	}

}
