package Library_System;

import java.util.ArrayList;
import java.util.List;

public class LibraryMangSystem {
List<Book>bookInventory ;
List<Users>registeredUsers  ;

LibraryMangSystem(){
    this.bookInventory=new ArrayList<>();
    this.registeredUsers = new ArrayList<>();
}

void addBook(Book book){
    this.bookInventory.add(book);

}
void registerUser(Users user){
    this.registeredUsers.add(user);
}

List<Book> searchBooks(String criteria){
  List<Book> result=new ArrayList<>();

  for (Book book : bookInventory) {
     if(book.title.equalsIgnoreCase(criteria)||book.author.equalsIgnoreCase(criteria)){
        result.add(book);
       }
    }

 return result;
    
}
List<Book> searchBooks(String criteria,String type){
    List<Book>result=new ArrayList<>();
    BookType searchType;
    try {
         searchType = BookType.valueOf(type.toUpperCase()); //search in enum 

    } catch (IllegalArgumentException e) {
        System.out.println("Invalid book type: " + type);
        return result;
    }
    
    for (Book book : bookInventory) {
          if((book.title.equalsIgnoreCase(criteria)||book.author.equalsIgnoreCase(criteria))&&book.type==type){
        result.add(book);
       }  
    }



    return result;

}


}
