package Library_System;

public class Member extends Users {

    public int borrowedBooksCount;
    public final int MAX_BORROW_LIMIT = 5;


     Member(int borrowedBooksCount ){
        super();
        this.borrowedBooksCount=borrowedBooksCount;
    }
    Member(String name ,String contactInfo,int borrowedBooksCount){
        super(name, contactInfo);
        this.borrowedBooksCount=borrowedBooksCount;
    }


    @Override
    void displayDashboard() {
        // TODO Auto-generated method stub
        System.out.println("Member Dashboard");
        System.out.println("Books Borrowed:"+borrowedBooksCount);
        
    }

    @Override
    boolean canBorrowBooks() {
        if (this.borrowedBooksCount<MAX_BORROW_LIMIT) {
            return true;
        }
        return false;
        
        // TODO Auto-generated method stub

        
    }

    
   
    

}
