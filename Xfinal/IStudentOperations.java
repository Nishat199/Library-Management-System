
import java.io.IOException;
public interface IStudentOperations {
void insertStudent(Student s)throws IOException;
void removeStudent(Student s);
Student getStudent(String studentId)throws IOException;
void showAllStudents( )throws IOException;
    
}