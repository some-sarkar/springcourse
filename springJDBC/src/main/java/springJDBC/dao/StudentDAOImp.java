package springJDBC.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import springJDBC.entities.Student;
import springJDBC.util.RowMapperImpl;

public class StudentDAOImp implements StudentDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insert(Student student) {
	
		String query = "INSERT INTO student(name, city) VALUES(?,?)";
		int result = this.jdbcTemplate.update(query, student.getName(), student.getCity());
		
		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int updateTable(Student student) {
		String query = "UPDATE student SET name=?, city=? where id=?";
		int result = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return result;
	}

	@Override
	public int delete(Student student) {
		String query = "DELETE FROM student where id=?";
		int result = this.jdbcTemplate.update(query, student.getId());
		return result;
	}

	@Override
	public List<Student> selectAllData() {

		String query = "SELECT * FROM student";
		RowMapper<Student> row = (rs, rowNum) -> new Student(rs.getInt(1), rs.getString(2), rs.getString(3));		
		
		//RowMapper<Student> row = new RowMapperImpl();
		List<Student> data = this.jdbcTemplate.query(query, row);
		return data;
	}


	

}
