package ya.springboot.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ya.springboot.sms.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long>{

}
