package Library_System;
enum BookType {
    TEXTBOOK,
    NOVELBOOK,
    OTHER
}
public abstract class Book implements Lendable {

String isbn;
String title;
String author;
boolean isAvailable;
String type;
    

Book(){
    this.isAvailable =true;
}

Book(String isbn,String title,String author){
    this.isbn=isbn;
    this.title=title;
    this.author=author;
}

    @Override
    public boolean lend(Users user) {
       
       if(isAvailable =true && user.canBorrowBooks()){
           this.isAvailable=false;
           return true;
       }
       return false;
    }

    @Override
    public void returnBook(Users user) {
       
        this.isAvailable=true;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
       
    }

   abstract void displayBookDetails();
}
