package Library_System;

public class NovelBook extends Book {
    String genre;
   
    NovelBook(String isbn,String title,String author,String type,boolean isAvailable,String genre){
        super(isbn, title, author);
        this.type=type;
        this.isAvailable=isAvailable;
        this.genre=genre;  
    }

    @Override
    void displayBookDetails() {
      
       System.out.println("isbn: "+isbn+" author: "+author+" type: "+type+" isisAvailable:"+isAvailable+" genre:"+genre);
    }

}
