package Library_System;

public class Main {
  public static void main(String[] args) {
    // Users users =new Users();
    // Users users1 =new Users("Mradul","123456667");
    // Users users2=new Users(users1);
    Users Member=new Member(1);
    Users Member1=new Member("Mradul","123456667",5);
    Users Librarian= new Librarian("12345432");
  
   Member.displayDashboard();
    System.out.println(Member.canBorrowBooks());

   
   Member1.displayDashboard();
   System.out.println(Member1.canBorrowBooks());

   Librarian.displayDashboard();
   System.out.println(Librarian.canBorrowBooks());

   LibraryMangSystem add_user_book =new LibraryMangSystem();
     add_user_book.registerUser(Member1);
     add_user_book.registerUser(Member);

     System.out.println(add_user_book.registeredUsers);


  //  Book book=new Book();
  //   book.author="Priyanshi";
  //   book.isAvailable=true;
  //  book.title="harry potter";


  //   Book book1=new Book();
  //   book1.author="Priyanshi";
  //   book1.isAvailable=true;
  //  book1.title="harry potter";
  //  book1.type="NOVELBOOK";
  
  //  add_user_book.addBook(book);
  //  add_user_book.addBook(book1);

  //  List<Book>result =add_user_book.searchBooks("Priyanshi");
  //  for (Book book2 : result) {
  //        System.out.print(book2.author);
  //         System.out.print(" "+book2.title);
  //         System.out.println(" "+book2.type);
  //  }


  
    
   
  //   List<Book> result2= add_user_book.searchBooks("Priyanshi","NOVELBOOK");
  //   for (Book book2 : result2) {
  //      System.out.print(book2.author);
  //         System.out.print(" "+book2.title);
  //         System.out.println(" " +book2.type);
  //   }
    
  //   System.out.println(book.lend(Member));
  //   System.out.println(book.lend(Member1));



  //  System.out.println("book can be lend "+book.lend(Member));
  //   System.out.println("book can be lend "+book.lend(Member1));  

Book book3=new NovelBook("null", "harrypoter", "qwer", "notebook", true, "magic");
  book3.displayBookDetails();

  Book book4 = new TextBook("null", "science", "sachin", "sinec book", false, "Science", 0);
   
  book4.displayBookDetails();
    
  }
}
