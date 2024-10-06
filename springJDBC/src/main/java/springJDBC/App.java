package springJDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import springJDBC.dao.StudentDAO;
import springJDBC.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program Started" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        StudentDAO studentDao = (StudentDAO) context.getBean("studentDao");
//        Student student = new Student("Someshwar1", "USA");
//        int result = studentDao.insert(student);
//        System.out.println(result+" rows inserted");
        
//        Student student = new Student(3, "Someshwar", "German");
//        int r = studentDao.updateTable(student);
//        System.out.println(r+" rows updated");
        

//        Student student = new Student(3);
//        int r = studentDao.delete(student);
//        System.out.println(r+" rows deleted");
        
        List<Student> data = studentDao.selectAllData();
        for(Student student: data) {
        	System.out.println(student);
        }
        
    }
}
