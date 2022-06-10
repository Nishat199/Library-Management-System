import java.io.IOException;
public interface ITeacherOperations {
    void insertTeacher(Teacher t)throws IOException;
void removeTeacher(Teacher t);
Teacher getTeacher(String teacherId)throws IOException;
void showAllTeachers( )throws IOException;

}