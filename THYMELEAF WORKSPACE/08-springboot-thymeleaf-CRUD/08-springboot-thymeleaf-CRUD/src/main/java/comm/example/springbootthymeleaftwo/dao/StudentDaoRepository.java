package comm.example.springbootthymeleaftwo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import comm.example.springbootthymeleaftwo.entity.Student;

public interface StudentDaoRepository extends JpaRepository<Student, Integer> {

}
