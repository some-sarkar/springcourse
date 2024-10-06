package boot.jdbc.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import boot.jdbc.type.Student;

@Repository
public class StudentRepo {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void createTable() {
		String q = "CREATE TABLE IF NOT EXISTS student (" +
                "id INT AUTO_INCREMENT PRIMARY KEY, " +
                "name VARCHAR(100) NOT NULL, " +
                "city VARCHAR(100) NOT NULL" +
                ")";
		jdbcTemplate.execute(q);
		System.out.println("table created");
	}
	
	public void save(Student student) {
		
		String q = "INSERT INTO student(name, city) VALUES(?, ?)";
		jdbcTemplate.update(q, student.getName(), student.getCity());
		
	}
	
	public List<Student> fetchData(){
		String q = "SELECT * FROM student";
		
		
		RowMapper<Student> rows = (rs, rowNum) -> new Student(rs.getInt(1), rs.getString(2), rs.getString(3));
		
		List<Student> students = jdbcTemplate.query(q, rows);
		return students;
	}
	
}
