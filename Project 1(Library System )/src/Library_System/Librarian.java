package Library_System;

public class Librarian extends Users{
String   employeeNumber ;


public Librarian(String employeeNumber){
    super();
    this.employeeNumber= employeeNumber;
}
public Librarian(String name, String contactInfo, String employeeNumber){
    super(name,contactInfo);
    this.employeeNumber= employeeNumber;
}

void displayDashboard(){
    
    System.out.println("Librarian Dashboard");
    System.out.println("employeeNumber:"+employeeNumber);
}
@Override
boolean canBorrowBooks() {
    // TODO Auto-generated method stub
   return true;
}
// void addNewBook(Book book){}
// void removeBook(Book book){}

}
