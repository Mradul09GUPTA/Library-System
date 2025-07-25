package Library_System;

public class TextBook extends Book {
String subject;
int edition;

 TextBook(String isbn,String title,String author,String type,boolean isAvailable,String subject,int edition){
        super(isbn, title, author);
        this.type=type;
        this.isAvailable=isAvailable;
        this.subject=subject; 
        this.edition=edition; 
    }

    @Override
    void displayBookDetails() {
         System.out.println("isbn: "+isbn+" author: "+author+" type: "+type+" isisAvailable:"+isAvailable+" subject:"+subject+" edition:"+edition);
    }

}
