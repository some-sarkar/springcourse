package boot.jdbc;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import boot.jdbc.repo.StudentRepo;
import boot.jdbc.type.Student;

@SpringBootApplication
public class SpringBootJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootJdbcApplication.class, args);
		
		Student student = context.getBean(Student.class);
		student.setName("Some1");
		student.setCity("USA1" );
		
		StudentRepo studentRepo = context.getBean(StudentRepo.class);
		studentRepo.createTable();
		studentRepo.save(student);
		List<Student> data = studentRepo.fetchData();
		for(Student s: data) {
			System.out.println(s);
		}
	}

}
