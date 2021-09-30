package ya.springboot.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ya.springboot.sms.entity.Student;
import ya.springboot.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Student student1 = new Student("Alaoui", "Nourdine", "a.nourdine@gmail.com");
		studentRepository.save(student1);
		
		Student student2 = new Student("Farissi", "Ahmed", "f.ahmed@gmail.com");
		studentRepository.save(student2);
		
		Student student3 = new Student("Moutawakil", "Badr", "m.badr@gmail.com");
		studentRepository.save(student3);
	}

}
