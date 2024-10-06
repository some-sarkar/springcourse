package springJDBC.dao;

import java.util.List;

import springJDBC.entities.Student;

public interface StudentDAO {
	
	public int insert(Student student);
	public int updateTable(Student student);
	public int delete(Student student);
	public List<Student> selectAllData();

}
