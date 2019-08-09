package comm.example.springbootthymeleaftwo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import comm.example.springbootthymeleaftwo.dao.StudentDaoRepository;
import comm.example.springbootthymeleaftwo.entity.Student;
@Service
public class StudentServiceImpl implements StudentService {

	
	private StudentDaoRepository studentDaoRepository;
	
	@Autowired
	public StudentServiceImpl(StudentDaoRepository studentDaoRepository) {
		super();
		this.studentDaoRepository = studentDaoRepository;
	}
	
	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentDaoRepository.findAll();
	}
	@Override
	public Student save(Student stud) {
		// TODO Auto-generated method stub
		return studentDaoRepository.save(stud);
	}

}