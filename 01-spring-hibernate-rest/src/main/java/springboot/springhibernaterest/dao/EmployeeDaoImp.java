package springboot.springhibernaterest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springboot.springhibernaterest.entity.Employee;


@Repository
public class EmployeeDaoImp implements EmployeeDao {

	private EntityManager entityManager;
	
	
	@Autowired
	public EmployeeDaoImp(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}



	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method 
		Session currentSession=entityManager.unwrap(Session.class);
		Query<Employee> thequery = currentSession.createQuery("from Employee",Employee.class);
		return thequery.list();
	}

	
	public Employee findEmployeeById(int theId)
	{
		Session currentSession=  entityManager.unwrap(Session.class);
		Employee theEmployee= currentSession.get(Employee.class, theId);
		return theEmployee;
	}



	@Override
	public void deleteEmployee(int theId) {
		// TODO Auto-generated method stub
		Session currentSession=entityManager.unwrap(Session.class);
		Employee emp = currentSession.get(Employee.class, theId);
		
		currentSession.delete(emp);
	}



	@Override
	public void saveEmployee(Employee theEmployee) {
		// TODO Auto-generated method stub
		// get current hibernate session
				Session currentSession = entityManager.unwrap(Session.class);
				
				// save/upate the customer ... finally LOL
				currentSession.saveOrUpdate(theEmployee);
			
		
	}





	
	

}
