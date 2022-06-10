import java.io.*;

public class Teacher extends Patron {
    String teacherId;
    void setTeacherId(String teacherId){
        this.teacherId = teacherId;
    }
    String getTeacherId(){
        return teacherId;
    }
    int officeRoomNo;
    void setOfficeRoomNo(int officeRoomNo){
        this.officeRoomNo = officeRoomNo;
    }
    int getOfficeRoomNo(){
        return officeRoomNo;
    }
    void showInfo(){
        System.out.println("Name: "+ getName());
        System.out.println("Id: "+ getId()+"\n");
        System.out.println("Office Room No:  "+ getOfficeRoomNo()+ "\n" );
    }
    public void borrow(Patron p, Book b) throws IOException {
        FileWriter fw = new FileWriter("books.txt", true);
        fw.write("Borrowed Books: "+b.getTitle()+" id: "+b.getBookId()+" teachers id: "+p.getId());
        fw.close();
    }
    public void returnBook(Patron p, Book b){
        System.out.println("Thanks for returing book");
    }
    public void fine(Patron p, double amount) throws IOException {
        FileWriter fw = new FileWriter("teachers.txt", true);
        fw.write("teachers id: "+p.getId()+" fine: "+amount);
        fw.close();
    }

    void setOfficeRoomNo(String officeRoomNo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}