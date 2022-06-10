import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class LIbrary{
String libraryName;
String address;
Student students[ ] =  new Student[10];
    int size =0;
    void insertStudent(Student s) throws IOException {
        students[size] = s;
        size++;
        try{
            FileReader fr = new FileReader("students.txt");
        }
        catch(Exception e){
            PrintWriter pw = new PrintWriter("students.txt");
            pw.close();
        }
        FileWriter fw = new FileWriter("students.txt",true);
        fw.write("Name: "+s.getName()+"\n");
        fw.write("Id: "+s.getStudentId()+"\n");
        fw.write("Guardian Name: "+s.getGuardianName()+"\n");
        fw.write("Guardian Contact: "+s.getGuardianContactNo()+"\n");
        fw.close();
    }
    void removeStudent(Student s){
        for(int i=0;i<size;i++){
            if(students[i].equals(s)){
                students[i]=null;
                break;
            }
        }
    }
    Student getStudent(int studentId){
        String stId = studentId+"";
        for(int i=0;i<size;i++){
            if(students[i].getStudentId().equals(null))
                continue;
            if(students[i].getStudentId().equals(stId))
                return students[i];
        }
        System.out.println("Student does not exists");
        return null;
    }
    void showAllStudents(){
        for(int i=0;i<size;i++){
            if(students[i].equals(null))
                continue;
            students[i].showInfo();
        }
    }

Teacher teachers[] = new Teacher[10];
    int size1 =0;
    void insertTeacher(Teacher t) throws IOException{
        teachers[size1] = t;
        size++;
        try{
            FileReader fr = new FileReader("teachers.txt");
        }
        catch(Exception e){
            PrintWriter pw = new PrintWriter("teachers.txt");
            pw.close();
        }
        FileWriter fw = new FileWriter("teachers.txt", true);
        fw.write("Name: "+t.getName()+"\n");
        fw.write("Id: "+t.getTeacherId()+"\n");
        fw.close();
    }
    Teacher getTeacher(int teacherId){
        String tId = teacherId+"";
        for(int i=0;i<size;i++){
            if(teachers[i].getTeacherId().equals(null))
                continue;
            if(teachers[i].getTeacherId().equals(tId))
                return teachers[i];
        }
        System.out.println("Teacher does not exists");
        return null;
    }
    void showAllTeachers(){
        for(int i=0;i<size;i++){
            if(teachers[i].equals(null))
                continue;
            teachers[i].showInfo();
        }
    }
Book books[ ]= new Book[10];
    int size2 = 0;
    void insertBook(Book b) throws IOException {
        books[size2] = b;
        size++;
        try{
            FileReader fr = new FileReader("books.txt");
        }
        catch(Exception e){
            PrintWriter pw = new PrintWriter("books.txt");
            pw.close();
        }
        FileWriter fw = new FileWriter("books.txt", false);
        fw.write("Title: "+b.getTitle()+"\n");
        fw.write("Subtitle: "+b.getSubtitle()+"\n");
        fw.write("Subtitle: "+b.getSubtitle()+"\n");
        fw.write("Author: "+b.getAuthor()+"\n");
        fw.write("Publisher: "+b.getPublisher()+"\n");
        fw.close();
    }
    Book getBook(int bookId){
        for(int i=0;i<size;i++){
            if(books[i].getBookId()==0)
                continue;
            if(books[i].getBookId()==bookId)
                return books[i];
        }
        System.out.println("Book does not exists");
        return null;
    }
    void showAllBooks(){
        for(int i=0;i<size;i++){
            if(books[i]==null)
                continue;
            books[i].showInfo();
        }
    }
int noOfBooks;
Librarian librarian;

        }
