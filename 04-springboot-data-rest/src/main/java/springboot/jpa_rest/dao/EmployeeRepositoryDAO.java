package springboot.jpa_rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.jpa_rest.entity.Employee;

public interface EmployeeRepositoryDAO extends JpaRepository<Employee, Integer> {

}
