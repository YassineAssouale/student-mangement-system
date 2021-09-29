package ya.springboot.sms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ya.springboot.sms.entity.Student;
import ya.springboot.sms.repository.StudentRepository;

@Service
public class StudentServiceImp implements ya.springboot.sms.service.StudentService{
	@Autowired
	private StudentRepository studentRepository;
	
//	public StudentServiceImp(StudentRepository studentRepository) {
//		super();
//		this.studentRepository = studentRepository;
//	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
}
