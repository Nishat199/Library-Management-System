import java.io.IOException;
import java.util.Scanner;


public class Librarian {
 String name;
String Id;
double salary;
int age;
void setName(String name)
{
this.name=name;
}
void setID(String Id)
{
this.Id=Id;
}
void setSalary(double salary)
{
 this.salary=salary;
}
void setAge(int age)
{
 this.age=age;
}
String getName( )
{
return name;
}
String getID( )
{
  return Id;
}
double getSalary( )
{
 return salary;
}
int getAge( )
{
    return age;
}
void generateFine(Patron P, double amount) throws IOException{
    System.out.println("Are you 1. student or 2.teacher?");
    Scanner sc = new Scanner(System.in);
      LIbrary lb= new LIbrary() ;               
    int type = sc.nextInt();
                    System.out.println("Insert your id");
                    int id = sc.nextInt();
                    System.out.println("Insert fine amount");
                    double f = sc.nextDouble();
                    if(type == 1){
                        Student s1 = lb.getStudent(id);
                        s1.fine(s1, f);
                    }
                    else if(type ==2){
                        Teacher t1 = lb.getTeacher(id);
                        t1.fine(t1, f);
                    }
                }
}



    

