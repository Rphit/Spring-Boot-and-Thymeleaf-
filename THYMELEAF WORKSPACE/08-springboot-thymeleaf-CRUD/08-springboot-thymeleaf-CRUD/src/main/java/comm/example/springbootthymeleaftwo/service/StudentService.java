package comm.example.springbootthymeleaftwo.service;

import java.util.List;

import comm.example.springbootthymeleaftwo.entity.Student;

public interface StudentService {
	
	
	public List<Student> findAll();
	
	public Student save(Student stud);

}
